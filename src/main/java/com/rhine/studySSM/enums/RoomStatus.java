package com.rhine.studySSM.enums;

import java.io.Serializable;

/**
 * @author lwep
 * @dareTime 2019/6/26 11:30
 */
public enum RoomStatus implements Serializable {
    LEISURE("空闲"),
    BLOCKS("已被预订"),
    OPENED("已被入住");

    private String status;

    private RoomStatus(String status){
        this.status=status;
    }

    public String getStatus(){
        return status;
    }
}
