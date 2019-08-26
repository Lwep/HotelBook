package com.rhine.studySSM.controller.user;

import com.rhine.studySSM.util.MD5CryptUtil;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rhine.studySSM.entity.User;
import com.rhine.studySSM.service.IUserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    /**
     * 前往登录页面
     * @param model
     * @return
     */
    @GetMapping("toLogin")
    public String toLogin(Model model) {

        return "WEB-INF/jsp/User/login";
    }

    /**
     *
     * 处理登录
     * @param user
     * @param model
     * @param req
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, Model model, HttpServletRequest req) {
        String viewName = "user/login";
        HttpSession session = req.getSession();
        String password = user.getPassword();//获取密码
        User user1 = userService.findByUsername(user.getUsername());//寻找数据库是否有此用户
        if(user1!=null){
            String md5pass = MD5CryptUtil.getSalts(user1.getPassword());
            String pass = Md5Crypt.md5Crypt(password.getBytes(),md5pass);
            if(!pass.equals(user1.getPassword())){
                System.out.println("密码错误!");
                return "fail";
            }
            session.setAttribute("user",user1);
            return "main";
        }else{
            System.out.println("用户不存在！");
            return "fail";
        }

////        if (user != null) {
////            User loginUser = userService.userlogin(user);
////            User user1 = userService.findByUsername(loginUser.getUsername());
////            System.out.println("user1++"+user1);
////            if (user1 != null) {
////                System.out.println("登录成功");
////                session.setAttribute("user", user1);
////                System.out.println("user1 +"+user1);
////                viewName = "redirect:../toIndex";
////            } else if(user1 == null) {
////                System.out.println("登录失败");
////                System.out.println(loginUser);
////                System.out.println("失败"+user);
////                viewName= "fail";
////            }
////        }
//        return viewName;
    }

    /**
     * 注销
     */
    @GetMapping("doLogout")
    public String doLogout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:../toIndex";
    }

    /**
     * 前往注册
     * @return
     */
    @GetMapping("toRegister")
    public String toRegister() {
        return "WEB-INF/jsp/User/register";
    }

    /**
     * 实现注册
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("register")
    public String register(User user, Model model) {
        String username = user.getUsername();
        // 如果数据库中没有该用户，可以注册，否则跳转页面
        if (userService.findByUsername(username) == null) {
           //实现密码加密处理
            user.setPassword(Md5Crypt.md5Crypt(user.getPassword().getBytes()));
            userService.register(user);
            // 注册成功跳转到主页面
            return "redirect:toLogin";
        } else {

            // 注册失败跳转到错误页面
            return "fail";
        }

    }



}



