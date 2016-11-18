package com.kraskovskij.car_shop.beans.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;

@Component
@Scope("request")
public class OptionsBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean conditioner;
    private Boolean leather;
    private Boolean alloyWheels;
    private Boolean xenon;
    private Boolean pdc;
    private Boolean assHeating;
    private Boolean asc;
    private Boolean navi;
    private Boolean speakerphone;
    private Boolean fogLights;
    private Boolean signaling;

    @PostConstruct
    public void init() {
        conditioner = false;
        leather = false;
        alloyWheels = false;
        xenon = false;
        pdc = false;
        assHeating = false;
        asc = false;
        navi = false;
        speakerphone = false;
        fogLights = false;
        signaling = false;
    }

    public Boolean getConditioner() {
        return conditioner;
    }

    public void setConditioner(Boolean conditioner) {
        this.conditioner = conditioner;
    }

    public Boolean getLeather() {
        return leather;
    }

    public void setLeather(Boolean leather) {
        this.leather = leather;
    }

    public Boolean getAlloyWheels() {
        return alloyWheels;
    }

    public void setAlloyWheels(Boolean alloyWheels) {
        this.alloyWheels = alloyWheels;
    }

    public Boolean getXenon() {
        return xenon;
    }

    public void setXenon(Boolean xenon) {
        this.xenon = xenon;
    }

    public Boolean getPdc() {
        return pdc;
    }

    public void setPdc(Boolean pdc) {
        this.pdc = pdc;
    }

    public Boolean getAssHeating() {
        return assHeating;
    }

    public void setAssHeating(Boolean assHeating) {
        this.assHeating = assHeating;
    }

    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public Boolean getNavi() {
        return navi;
    }

    public void setNavi(Boolean navi) {
        this.navi = navi;
    }

    public Boolean getSpeakerphone() {
        return speakerphone;
    }

    public void setSpeakerphone(Boolean speakerphone) {
        this.speakerphone = speakerphone;
    }

    public Boolean getFogLights() {
        return fogLights;
    }

    public void setFogLights(Boolean fogLights) {
        this.fogLights = fogLights;
    }

    public Boolean getSignaling() {
        return signaling;
    }

    public void setSignaling(Boolean signaling) {
        this.signaling = signaling;
    }
}
