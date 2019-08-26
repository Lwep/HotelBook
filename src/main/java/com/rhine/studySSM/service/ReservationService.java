package com.rhine.studySSM.service;

import com.rhine.studySSM.entity.Reservation;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/7/1 15:54
 */
public interface ReservationService {
    boolean saveReservation(Reservation reservation);

    boolean modifyReservationStatus( Integer status,Integer reservationId, Integer adminId);

    List<Reservation> listReservationByUserId(Integer userId);

    Integer selectReservationStatus(Integer reservationId);

    List<Reservation> listAllResetvation();
}
