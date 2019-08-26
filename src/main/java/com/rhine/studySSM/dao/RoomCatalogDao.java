package com.rhine.studySSM.dao;

import com.rhine.studySSM.entity.RoomCatalog;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lwep
 * @dareTime 2019/6/26 11:35
 */
@Repository
public interface RoomCatalogDao {

    int save(RoomCatalog roomCatalog);

        int delete(Integer id);

    RoomCatalog selectByCatalogName(String catalog);

    RoomCatalog selectById(Integer id);

    List<RoomCatalog> listAll();
}
