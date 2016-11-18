package com.kraskovskij.car_shop.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "options", schema = "carshop")
public class Options implements Serializable {

    private static final long serialVersionUID = -5170875020617735653L;
    private int id;
    private Byte conditioner;
    private Byte leather;
    private Byte alloyWheels;
    private Byte xenon;
    private Byte pdc;
    private Byte assHeating;
    private Byte asc;
    private Byte navi;
    private Byte speakerphone;
    private Byte fogLights;
    private Byte signaling;

    public Options() {
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "conditioner")
    public Byte getConditioner() {
        return conditioner;
    }

    public void setConditioner(Byte conditioner) {
        this.conditioner = conditioner;
    }

    @Basic
    @Column(name = "leather")
    public Byte getLeather() {
        return leather;
    }

    public void setLeather(Byte leather) {
        this.leather = leather;
    }

    @Basic
    @Column(name = "alloy_wheels")
    public Byte getAlloyWheels() {
        return alloyWheels;
    }

    public void setAlloyWheels(Byte alloyWheels) {
        this.alloyWheels = alloyWheels;
    }

    @Basic
    @Column(name = "xenon")
    public Byte getXenon() {
        return xenon;
    }

    public void setXenon(Byte xenon) {
        this.xenon = xenon;
    }

    @Basic
    @Column(name = "pdc")
    public Byte getPdc() {
        return pdc;
    }

    public void setPdc(Byte pdc) {
        this.pdc = pdc;
    }

    @Basic
    @Column(name = "ass_heating")
    public Byte getAssHeating() {
        return assHeating;
    }

    public void setAssHeating(Byte assHeating) {
        this.assHeating = assHeating;
    }

    @Basic
    @Column(name = "asc")
    public Byte getAsc() {
        return asc;
    }

    public void setAsc(Byte asc) {
        this.asc = asc;
    }

    @Basic
    @Column(name = "navi")
    public Byte getNavi() {
        return navi;
    }

    public void setNavi(Byte navi) {
        this.navi = navi;
    }

    @Basic
    @Column(name = "speakerphone")
    public Byte getSpeakerphone() {
        return speakerphone;
    }

    public void setSpeakerphone(Byte speakerphone) {
        this.speakerphone = speakerphone;
    }

    @Basic
    @Column(name = "fog_lights")
    public Byte getFogLights() {
        return fogLights;
    }

    public void setFogLights(Byte fogLights) {
        this.fogLights = fogLights;
    }

    @Basic
    @Column(name = "signaling")
    public Byte getSignaling() {
        return signaling;
    }

    public void setSignaling(Byte signaling) {
        this.signaling = signaling;
    }
}
