package com.rhine.studySSM.entity;

import com.rhine.studySSM.enums.RoomStatus;

/**
 * 房间信息
 * @author lwep
 * @dareTime 2019/6/26 11:28
 */
public class RoomInfo {
    //主键id
    private Integer id;
    //房间号
    private String roomNum;
    //房间面积
    private Integer area;
    //客房主图
    private String primaryPhoto;
    //房间简介
    private String intro;
    //客房价格
    private Double price;
    //客房类别
    private RoomCatalog roomCatalog;
    //客房状态
    private Integer roomStatus;
    //版本控制
    private Long version;

    public RoomInfo() {
    }

    public RoomInfo(String roomNum, Integer area, String primaryPhoto, String intro, Double price, RoomCatalog roomCatalog, Integer roomStatus) {
        this.roomNum = roomNum;
        this.area = area;
        this.primaryPhoto = primaryPhoto;
        this.intro = intro;
        this.price = price;
        this.roomCatalog = roomCatalog;
        this.roomStatus = roomStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(String roomNum) {
        this.roomNum = roomNum;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getPrimaryPhoto() {
        return primaryPhoto;
    }

    public void setPrimaryPhoto(String primaryPhoto) {
        this.primaryPhoto = primaryPhoto;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public RoomCatalog getRoomCatalog() {
        return roomCatalog;
    }

    public void setRoomCatalog(RoomCatalog roomCatalog) {
        this.roomCatalog = roomCatalog;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "RoomInfo{" +
                "id=" + id +
                ", roomNum='" + roomNum + '\'' +
                ", area=" + area +
                ", primaryPhoto='" + primaryPhoto + '\'' +
                ", intro='" + intro + '\'' +
                ", price=" + price +
                ", roomCatalog=" + roomCatalog +
                ", roomStatus=" + roomStatus +
                ", version=" + version +
                '}';
    }
}
