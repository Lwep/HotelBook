package com.rhine.studySSM.controller.admin;

import com.rhine.studySSM.entity.Admin;
import com.rhine.studySSM.entity.User;
import com.rhine.studySSM.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author lwep
 * @dareTime 2019/6/25 15:00
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * 前往登录页面
     * @param model
     * @return
     */
    @GetMapping("toLogin")
    public String toLogin(Model model) {
        return "WEB-INF/jsp/Admin/login";
    }

    /**
     * 管理员登录
     * @param admin
     * @param model
     * @param req
     * @return
     */
    @RequestMapping("/login")
    public String login(Admin admin, Model model, HttpServletRequest req) {
        String viewName = "admin/login";
        HttpSession session = req.getSession();
        if (admin != null) {
            Admin loginAdmin = adminService.login(admin);
            if (loginAdmin != null) {
                System.out.println("登录成功");
                System.out.println(loginAdmin);
                session.setAttribute("admin", loginAdmin);
                viewName = "redirect:toOperate";
            } else {
                System.out.println("登录失败");
                return "fail";
            }
        }
        return viewName;
    }

    /**
     * 返回管理员首页
     * @param hint
     * @param model
     * @return
     */
    @GetMapping("/toOperate")
    public String toOperate(String hint, Model model) {
        return "WEB-INF/jsp/Admin/operate";
    }

    /**
     * 前往修改密码
     * @return
     */
    @GetMapping("/toUpdatePassword")
    public String toUpdatePassword() {
        return "WEB-INF/jsp/Admin/updatePassword";
    }



    @PostMapping("/updatePassword")
    public String updatePassword(String password, HttpSession session) {
        Admin admin = (Admin) session.getAttribute("admin");
        admin.setPassword(password);
        adminService.updatePassword(admin);
        session.removeAttribute("admin");
        return  "redirect:toLogin";
    }

}
