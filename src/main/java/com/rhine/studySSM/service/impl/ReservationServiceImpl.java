package com.rhine.studySSM.service.impl;

import com.rhine.studySSM.dao.AdminDao;
import com.rhine.studySSM.dao.ReservationDao;
import com.rhine.studySSM.dao.RoomInfoDao;
import com.rhine.studySSM.entity.Reservation;
import com.rhine.studySSM.entity.RoomInfo;
import com.rhine.studySSM.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/7/1 15:54
 */
@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationDao reservationDao;

    @Autowired
    private AdminDao adminDao;


    @Autowired
    private RoomInfoDao roomInfoDao;


    @Override
    public boolean saveReservation(Reservation reservation) {
        reservation.setRoomStatus(1);
        RoomInfo room = reservation.getRoomInfo();
        System.out.println("impl" + room);
        Integer status = 0;
        room.setRoomStatus(status);
        roomInfoDao.modifyStatus(room);
        reservationDao.save(reservation);
        return true;

    }

    @Override
    public boolean modifyReservationStatus(Integer status, Integer reservationId, Integer adminId) {

        Reservation reservation = reservationDao.findById(reservationId);
        //用户撤销订单
        if (adminId == null) {
            reservation.setRoomStatus(2);
            RoomInfo room = reservation.getRoomInfo();
            room.setRoomStatus(1);
            roomInfoDao.modifyStatus(room);
            reservationDao.updateStatus(reservation);
        }

        //办理入住
        else if (adminId == 1) {
            reservation.setRoomStatus(3);
            reservationDao.updateStatus(reservation);
        }
        //办理退房
        else if (adminId == 2) {
            reservation.setRoomStatus(4);
            RoomInfo room = reservation.getRoomInfo();
            room.setRoomStatus(1);
            roomInfoDao.modifyStatus(room);
            reservationDao.updateStatus(reservation);
        }


        return true;
    }

    /**
     * 显示当前用户自己订单
     *
     * @param userId
     * @return
     */
    @Override
    public List<Reservation> listReservationByUserId(Integer userId) {
        List<Reservation> reservationList = reservationDao.findByUserId(userId);
        return reservationList;
    }

    @Override
    public Integer selectReservationStatus(Integer reservationId) {
        Reservation reservation = reservationDao.findById(reservationId);
        Integer status = reservation.getRoomStatus();
        return status;
    }

    @Override
    public List<Reservation> listAllResetvation() {
        return reservationDao.listAll();
    }


}
