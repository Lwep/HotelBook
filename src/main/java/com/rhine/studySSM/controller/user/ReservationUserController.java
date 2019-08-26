package com.rhine.studySSM.controller.user;


import com.rhine.studySSM.entity.Reservation;
import com.rhine.studySSM.entity.RoomInfo;
import com.rhine.studySSM.entity.User;
import com.rhine.studySSM.service.ReservationService;
import com.rhine.studySSM.service.RoomInfoService;
import com.rhine.studySSM.util.MailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * @author lwep
 * @dareTime 2019/7/1 15:52
 */
@Controller
@RequestMapping("/user/reservation")
public class ReservationUserController {

    @Autowired
    private RoomInfoService roomService;

    @Autowired
    private ReservationService reservationService;


    /**
     * 查看订单
     * @param request
     * @return
     */

    @GetMapping("/showByUser")
    public String toShowReservationByUser(HttpServletRequest request) {
        User user = (User) request.getSession().getAttribute("user");
        request.setAttribute("reservationList", reservationService.listReservationByUserId(user.getId()));
        System.out.println("获取订单+"+reservationService.listReservationByUserId(user.getId()));
        return "WEB-INF/jsp/User/reservation";
    }

    /**
     * 前往填写订单页面
     * @param roomNum
     * @param model
     * @return
     */
    @GetMapping("/order")
    public String toOrder(String roomNum, Model model) {
        model.addAttribute("roomNum", roomNum);
        return "WEB-INF/jsp/User/orderInfo";
    }


    /**
     * 提交预定
     * @param roomNum
     * @param reservation
     * @param request
     * @return
     */
    @PostMapping("/addByUser")
    public String addByUser(String roomNum, Reservation reservation, HttpServletRequest request) {
        String viewName = "WEB-INF/jsp/User/orderInfo";
        RoomInfo room = roomService.findRoomByRoomNum(roomNum);
        if (room != null) {
            User user = (User) request.getSession().getAttribute("user");
            System.out.println("当前登录用户"+user);
            System.out.println("用户邮箱"+user.getEmail());
            reservation.setUser(user);
            reservation.setRoomInfo(room);
            reservation.setOrderTime(new Date());
            if (reservationService.saveReservation(reservation)) {
                //发送预定房间成功邮件
                MailUtil mailUtil = new MailUtil();
                String to = user.getEmail();
                mailUtil.sendMail(to, "http://localhost:8888/");
                viewName = "redirect:showByUser";
            } else {
               viewName = "fail";
            }
        } else {
            viewName = "fail";
        }
        return viewName;
    }

    /**
     * 取消预定订单
     * @param reservationId
     * @param model
     * @return
     */
    @GetMapping("/cancel")
    public String cancel(Integer reservationId, Model model) {
        String viewName = "redirect:showByUser";
        Integer status = reservationService.selectReservationStatus(reservationId);
        System.out.println("当前状态+"+status);

        reservationService.modifyReservationStatus(status,reservationId,null);
        return viewName;
    }



}
