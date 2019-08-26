package com.rhine.studySSM.controller.admin;

import com.rhine.studySSM.entity.Reservation;
import com.rhine.studySSM.entity.User;
import com.rhine.studySSM.service.IUserService;
import com.rhine.studySSM.service.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/7/2 17:19
 */
@Controller
@RequestMapping("/admin/reservation")
public class ReservationAdminController {

    @Autowired
    private IUserService userService;

    @Autowired
    private ReservationService reservationService;


    /**
     * 前往订单查询页面
     * @return
     */

    @GetMapping("/doShowAllReservation")
    public String doShowAllReservation(HttpServletRequest request,Model model) {
        List<Reservation> reservationList = reservationService.listAllResetvation();
        model.addAttribute("reservationList",reservationList);
        System.out.println("订单列表++"+reservationList);
        return "WEB-INF/jsp/Admin/reservation";

    }

    /**
     * 办理入住
     * @param reservationId
     * @return
     */
    @GetMapping("/checkin")
    public String checkin(Integer reservationId){
        reservationService.modifyReservationStatus(1, reservationId,1);
        return "redirect:doShowAllReservation";
    }


    /**
     * 办理退房
     * @param reservationId
     * @return
     */
    @GetMapping("/checkout")
    public String checkout(Integer reservationId){
        reservationService.modifyReservationStatus(3, reservationId,2);
        return "redirect:doShowAllReservation";
    }


}
