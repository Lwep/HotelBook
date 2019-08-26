package com.rhine.studySSM.dao;

import com.rhine.studySSM.entity.RoomPhoto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/26 15:54
 */
@Repository
public interface RoomPhotoDao {

    int save(RoomPhoto roomPhoto);


    int delete(Integer id);

    int deleteByRoomId(Integer roomId);

    List<RoomPhoto> listByRoomInfoId(Integer id);
}
