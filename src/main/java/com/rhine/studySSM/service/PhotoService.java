package com.rhine.studySSM.service;

import com.rhine.studySSM.entity.RoomPhoto;

/**
 * @author lwep
 * @dareTime 2019/6/26 15:52
 */
public interface PhotoService {

    boolean add(RoomPhoto photo);

    boolean delete(Integer id);
}
