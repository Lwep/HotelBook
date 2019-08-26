package com.rhine.studySSM.controller.admin;

import com.rhine.studySSM.entity.User;
import com.rhine.studySSM.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/26 9:49
 */
@Controller
@RequestMapping("/super/user")
public class UserManageController {


    @Autowired
    private IUserService userService;


    @GetMapping("/all")
    public String list(Model model) {
        List<User> list = userService.getAll();
        model.addAttribute("list", list);
        return "WEB-INF/jsp/Admin/userInfo";
    }

}
