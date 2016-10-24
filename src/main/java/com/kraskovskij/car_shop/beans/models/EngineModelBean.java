package com.kraskovskij.car_shop.beans.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;

@Component
@Scope("request")
public class EngineModelBean implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer engineTypeId;
    private int volume;
    private int hp;
    private int nm;
    private Integer transmissionId;

    @PostConstruct
    public void init(){
        engineTypeId = null;
        volume = 0;
        hp = 0;
        nm = 0;
        transmissionId = null;
    }

    public Integer getEngineTypeId() {
        return engineTypeId;
    }

    public void setEngineTypeId(Integer engineTypeId) {
        this.engineTypeId = engineTypeId;
    }

    public Integer getTransmissionId() {
        return transmissionId;
    }

    public void setTransmissionId(Integer transmissionId) {
        this.transmissionId = transmissionId;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getNm() {
        return nm;
    }

    public void setNm(int nm) {
        this.nm = nm;
    }
}
