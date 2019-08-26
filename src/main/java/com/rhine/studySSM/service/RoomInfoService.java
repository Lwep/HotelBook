package com.rhine.studySSM.service;

import com.rhine.studySSM.entity.RoomCatalog;
import com.rhine.studySSM.entity.RoomInfo;
import com.rhine.studySSM.entity.RoomPhoto;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/26 11:33
 */
public interface RoomInfoService {

    List<RoomInfo> getSomeForIndex();

    boolean addRoomCatalog(RoomCatalog catalog);

    boolean deleteRoomCatalog(Integer catalogId);

    List<RoomCatalog> listAllCatalog();

    boolean addRoomInfo(RoomInfo roomInfo);

    boolean addPhoto(RoomPhoto photo);


    boolean deleteRoomInfoAndPhoto(String roomNum);

    void deletePhoto(Integer photoId);

    boolean updateRoomInfo(RoomInfo roomInfo);

    RoomCatalog findCatalogById(Integer catalogId);

    List<RoomPhoto> listPhotosByRoomId(Integer roomId);

    List<RoomInfo> listAllByCatalog(Integer catalogId);

    void delete(Integer id);

    RoomInfo findRoomByRoomNum(String roomNum);
}
