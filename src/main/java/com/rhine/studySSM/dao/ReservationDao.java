package com.rhine.studySSM.dao;

import com.rhine.studySSM.entity.Reservation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/7/1 16:18
 */
@Repository
public interface ReservationDao {
    int save(Reservation reservation);

    int updateStatus(Reservation reservation);

    Reservation findById(Integer id);

    List<Reservation> findByUserId(Integer userId);

    Integer countReservation();

    List<Reservation> listAll();
}
