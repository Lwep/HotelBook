package com.rhine.studySSM.controller.admin;

import com.rhine.studySSM.entity.RoomCatalog;
import com.rhine.studySSM.entity.RoomInfo;
import com.rhine.studySSM.service.RoomInfoService;
import com.rhine.studySSM.util.imgUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/26 15:51
 */
@Controller
@RequestMapping("/super/room")
public class RoomInfoController {

    @Autowired
    private RoomInfoService roomService;

    /**
     * 删除房间类型
     *
     * @param id
     * @return
     */
    @RequestMapping("/doDeleteCatalog/{room_catalog_id}")
    public String deletePaper(@PathVariable("room_catalog_id") Integer id) {
        roomService.deleteRoomCatalog(id);
        return "redirect:../doShowRoomByCatalog";
    }


    /**
     * 前往添加房间类型
     *
     * @return
     */
    @GetMapping("/toAddCatalog")
    public String toAddCatalog() {
        return "WEB-INF/jsp/Admin/addCatalog";
    }

    /**
     * 添加房间类型
     *
     * @param catalog
     * @param model
     * @return
     */
    @PostMapping("/doAddCatalog")
    public String doAddCatalog(RoomCatalog catalog, Model model) {
        roomService.addRoomCatalog(catalog);
        return "redirect:doShowRoomByCatalog";
    }

    /**
     * 查看房间 返回上一页查看房型 remove房型
     *
     * @param session
     * @return
     */
    @GetMapping("/toShowRoomByCatalog")
    public String toShowRoomByCatalog(HttpSession session) {
        session.removeAttribute("catalog");
        return "redirect:doShowRoomByCatalog";
    }

    /**
     * 显示房间类型
     *
     * @param model
     * @return
     */
    @GetMapping("/doShowRoomByCatalog")
    public String list(HttpServletRequest request,Model model) {
        List<RoomCatalog> list = roomService.listAllCatalog();
        model.addAttribute("list", list);

        return "WEB-INF/jsp/Admin/showRoom";
    }

    /**
     * 显示选择房间类型下的房间
     *
     * @param request
     * @param catalogId
     * @return
     */
    @GetMapping("/doShowRoomById/{room.id}")
    public String doShowRoomById(HttpServletRequest request, @PathVariable("room.id") Integer catalogId, Model model) {
        RoomCatalog catalog = (RoomCatalog) request.getSession().getAttribute("catalog");
        if (catalog == null) {
            catalog = roomService.findCatalogById(catalogId);
            request.getSession().setAttribute("catalog", catalog);
        }
        List<RoomInfo> list = roomService.listAllByCatalog(catalogId);
        model.addAttribute("list", list);
        System.out.println(list);
        return "WEB-INF/jsp/Admin/roomInfo";
    }

    /**
     * 前往添加房间
     *
     * @return
     */
    @GetMapping("/toAddRoom")
    public String toAddRoom() {

        return "WEB-INF/jsp/Admin/addRoom";
    }

    /**
     * 添加房间
     *
     * @param room
     * @param request
     * @return
     */
    @PostMapping("/doAddRoom")
    public String doAddRoom(RoomInfo room, MultipartFile primaryPhoto, HttpServletRequest request) throws IOException {
        System.out.println("www"+request.getSession().getAttribute("catalog"));
        String viewName = "redirect:doShowRoomByCatalog";
        String path = request.getServletContext().getRealPath("/upload/room/primary/");
        String newName = null;
        if (!primaryPhoto.isEmpty()) {
            newName = imgUpload.getHashFileName(primaryPhoto.getInputStream()) + imgUpload.getFilenameSuffix(primaryPhoto.getOriginalFilename());
            primaryPhoto.transferTo(new File(path + newName));
        } else {
            System.out.println("大失败");
            return "fail";
        }
        room.setRoomCatalog((RoomCatalog) request.getSession().getAttribute("catalog"));

        room.setPrimaryPhoto(newName);
        if (!roomService.addRoomInfo(room)) {

            viewName = "admin/addRoom";
        }

        return viewName;
    }


    @RequestMapping("/del/{room_info_id}")
    public String deleteRoom(@PathVariable("room_info_id") Integer id) {
        roomService.delete(id);
        return "redirect:../doShowRoomByCatalog";
    }


}
