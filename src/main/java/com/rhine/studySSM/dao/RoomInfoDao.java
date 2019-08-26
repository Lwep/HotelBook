package com.rhine.studySSM.dao;

import com.rhine.studySSM.entity.RoomInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/26 11:35
 */
@Repository
public interface RoomInfoDao {

    /**
     * 保存房间信息
     * @param roomInfo
     * @return
     */
    int save(RoomInfo roomInfo);

    /**
     * 删除房间
     * @param roomNum
     * @return
     */
    int deleteByRoomNum(String roomNum);

    /**
     *更新房间信息
     * @param roomInfo
     * @return
     */
    int update(RoomInfo roomInfo);

    /**
     * 修改房间状态
     * @param room
     * @return
     */
    int modifyStatus(RoomInfo room);

    /**
     *查找房间
     * @param num
     * @return
     */
    RoomInfo selectByNum(String num);


    /**
     *查找房间总数
     * @return
     */
    int count();


    /**
     *
     * @param id
     * @return
     */
    int countByRoomCatalogId(Integer id);


    /**
     *显示所有房间
     * @return
     */
    List<RoomInfo> getByVersion();


    List<RoomInfo> listAllByCatalog(Integer roomCatalogId);

    int delete(Integer id);
}
