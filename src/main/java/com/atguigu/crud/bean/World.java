package com.atguigu.crud.bean;

public class World {
    private Integer worldId;

    private String worldName;

    public Integer getWorldId() {
        return worldId;
    }

    public void setWorldId(Integer worldId) {
        this.worldId = worldId;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName == null ? null : worldName.trim();
    }
}