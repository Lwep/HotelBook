package com.rhine.studySSM.controller.user;

import com.rhine.studySSM.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lwep
 * @dareTime 2019/6/25 11:03
 */
@Controller
public class IndexController {
    @Autowired
    private RoomInfoService roomInfoService;

    @GetMapping(value = {"toIndex", "/"})
    public String toIndex(Model model) {
        return "main";
    }
}
