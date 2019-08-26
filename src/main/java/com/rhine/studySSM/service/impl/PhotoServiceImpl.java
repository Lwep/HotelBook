package com.rhine.studySSM.service.impl;

import com.rhine.studySSM.dao.RoomPhotoDao;
import com.rhine.studySSM.entity.RoomPhoto;
import com.rhine.studySSM.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author lwep
 * @dareTime 2019/6/26 15:53
 */
@Service
public class PhotoServiceImpl implements PhotoService {
    @Autowired
    private RoomPhotoDao roomPhotoDao;

    @Override
    public boolean add(RoomPhoto photo) {
        return roomPhotoDao.save(photo) == 1;
    }

    @Override
    public boolean delete(Integer id) {

        return roomPhotoDao.delete(id) == 1;
    }
}
