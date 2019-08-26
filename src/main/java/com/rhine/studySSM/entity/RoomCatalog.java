package com.rhine.studySSM.entity;

/**
 * 房间类型
 * @author lwep
 * @dareTime 2019/6/26 11:28
 */
public class RoomCatalog {
    //主键id
    private Integer id;
    //类别名称
    private String catalog;

    public RoomCatalog() {
    }

    public RoomCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    @Override
    public String toString() {
        return "RoomCatalog{" +
                "id=" + id +
                ", catalog='" + catalog + '\'' +
                '}';
    }
}
