package com.rhine.studySSM.controller.user;

import com.rhine.studySSM.entity.RoomInfo;
import com.rhine.studySSM.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lwep
 * @dareTime 2019/6/26 16:28
 */
@Controller
@RequestMapping("/user/room")
public class RoomUserController {

    @Autowired
    private RoomInfoService roomService;

    /**
     * 显示房间信息
     * @param catalogId
     * @param model
     * @return
     */
    @GetMapping("/showRoomByCatalog")
    public String showRoomByCatalog(Integer catalogId,Model model){
        model.addAttribute("catalogList",roomService.listAllCatalog());

        model.addAttribute("roominfo",roomService.listAllByCatalog(catalogId));

        return "WEB-INF/jsp/User/roomInfo";
    }


    /**
     * 显示详细房间信息
     * @param model
     * @param roomNum
     * @return
     */
    @GetMapping("/detailed")
    public String detailedRoomInfo(Model model,String roomNum){
        String viewName = "redirect:doShowRoomByCatalog";
        RoomInfo room=roomService.findRoomByRoomNum(roomNum);
        if (room!=null){
            model.addAttribute("room",room);
            viewName="WEB-INF/jsp/User/detailedRoom";
        }
        return viewName;
    }


}
