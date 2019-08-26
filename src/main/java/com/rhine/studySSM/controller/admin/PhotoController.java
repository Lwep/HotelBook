package com.rhine.studySSM.controller.admin;

import com.rhine.studySSM.service.PhotoService;
import com.rhine.studySSM.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lwep
 * @dareTime 2019/6/26 15:51
 */
@Controller
@RequestMapping("/super/room")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @Autowired
    private RoomInfoService roomService;


    @GetMapping("/deleteOne")
    public Boolean deleteOne(Integer photoId) {
        return photoService.delete(photoId);
    }


    @GetMapping("/toAddPhoto")
    public String toAddPhoto(String roomNum, Model model) {
        model.addAttribute("roomNum", roomNum);
        return "WEB-INF/jsp/Admin/addPhoto";
    }
}
