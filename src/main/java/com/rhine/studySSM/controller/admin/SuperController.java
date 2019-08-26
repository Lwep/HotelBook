package com.rhine.studySSM.controller.admin;

import com.rhine.studySSM.entity.Admin;
import com.rhine.studySSM.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/25 15:56
 */
@Controller
@RequestMapping("/super")
public class SuperController {

    @Autowired
    private AdminService adminService;

    /**
     * 前往超级管理员页面
     * @param request
     * @return
     */
    @GetMapping("/toSuper")
    public String toSuper(HttpServletRequest request) {

        return "WEB-INF/jsp/Admin/super";
    }

    /**
     * 显示所有管理员信息
     * @param model
     * @return
     */
    @GetMapping("doShowAllAdmin")
    public String list(Model model) {
        List<Admin> list = adminService.listAll();
        model.addAttribute("list", list);
        System.out.println("管理员list属性："+list);
        return "WEB-INF/jsp/Admin/adminInfo";
    }

    /**
     * 前往添加管理员页面
     * @return
     */

    @GetMapping("/toAddAdmin")
    public String toAddAdmin() {
        return "WEB-INF/jsp/Admin/addAdmin";
    }

    /**
     * 添加管理员
     * @param admin
     * @param model
     * @return
     */
    @PostMapping("doAddAdmin")
    public String doAddAdmin(Admin admin, Model model) {
        String adminname = admin.getUsername();
        if(adminService.findByUsername(adminname)==null) {
            adminService.register(admin);
            return "redirect:doShowAllAdmin";
        }
        else {
            return "fail";
        }
    }

    /**
     * 删除管理员
     * @param id
     * @return
     */
    @RequestMapping("/del/{admin_id}")
    public String deletePaper(@PathVariable("admin_id") Integer id) {
        adminService.delete(id);
        return "redirect:../doShowAllAdmin";
    }



}
