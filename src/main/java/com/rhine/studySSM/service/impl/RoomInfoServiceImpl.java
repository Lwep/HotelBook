package com.rhine.studySSM.service.impl;

import com.rhine.studySSM.dao.RoomCatalogDao;
import com.rhine.studySSM.dao.RoomInfoDao;
import com.rhine.studySSM.dao.RoomPhotoDao;
import com.rhine.studySSM.entity.RoomCatalog;
import com.rhine.studySSM.entity.RoomInfo;
import com.rhine.studySSM.entity.RoomPhoto;
import com.rhine.studySSM.enums.RoomStatus;
import com.rhine.studySSM.service.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/26 11:34
 */
@Service
public class RoomInfoServiceImpl  implements RoomInfoService {

    @Autowired
    private RoomInfoDao roomDao;

    @Autowired
    private RoomPhotoDao photoDao;

    @Autowired
    private RoomCatalogDao catalogDao;

    @Override
    public List<RoomInfo> getSomeForIndex() {
        return roomDao.getByVersion();
    }

    @Override
    public boolean addRoomCatalog(RoomCatalog catalog) {
        RoomCatalog temp = catalogDao.selectByCatalogName(catalog.getCatalog());
        if (temp != null) {
            return false;
        }
        return catalogDao.save(catalog) == 1;
    }

    @Override
    public boolean deleteRoomCatalog(Integer catalogId) {
        boolean flag = false;
        int count = roomDao.countByRoomCatalogId(catalogId);
        if (count == 0) {
            catalogDao.delete(catalogId);
            flag = true;
        }
        return flag;
    }

    @Override
    public List<RoomCatalog> listAllCatalog() {
        return catalogDao.listAll();
    }


    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addRoomInfo(RoomInfo roomInfo) {
        roomInfo.setRoomStatus(1);
        return roomDao.save(roomInfo) == 1;
    }

    @Override
    public boolean addPhoto(RoomPhoto photo) {
        return false;
    }

    @Override
    public boolean deleteRoomInfoAndPhoto(String roomNum) {
        return false;
    }

    @Override
    public void deletePhoto(Integer photoId) {

    }

    @Override
    public boolean updateRoomInfo(RoomInfo roomInfo) {
        return false;
    }

    @Override
    public RoomCatalog findCatalogById(Integer catalogId) {
        return catalogDao.selectById(catalogId);
    }


    @Override
    public List<RoomPhoto> listPhotosByRoomId(Integer roomId) {
        return null;
    }

    @Override
    public List<RoomInfo> listAllByCatalog(Integer catalogId) {
       return roomDao.listAllByCatalog(catalogId);
    }

    @Override
    public void delete(Integer id) {
        roomDao.delete(id);
    }

    @Override
    public RoomInfo findRoomByRoomNum(String roomNum) {
        return roomDao.selectByNum(roomNum);
    }

}
