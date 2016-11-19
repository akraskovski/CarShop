package com.kraskovskij.car_shop.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "options", schema = "carshop")
public class Options implements Serializable {

    private static final long serialVersionUID = -5170875020617735653L;
    private int id;
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

    public Options() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "conditioner", columnDefinition = "TINYINT(1)")
    public Boolean getConditioner() {
        return conditioner;
    }

    public void setConditioner(Boolean conditioner) {
        this.conditioner = conditioner;
    }

    @Basic
    @Column(name = "leather", columnDefinition = "TINYINT(1)")
    public Boolean getLeather() {
        return leather;
    }

    public void setLeather(Boolean leather) {
        this.leather = leather;
    }

    @Basic
    @Column(name = "alloy_wheels", columnDefinition = "TINYINT(1)")
    public Boolean getAlloyWheels() {
        return alloyWheels;
    }

    public void setAlloyWheels(Boolean alloyWheels) {
        this.alloyWheels = alloyWheels;
    }

    @Basic
    @Column(name = "xenon", columnDefinition = "TINYINT(1)")
    public Boolean getXenon() {
        return xenon;
    }

    public void setXenon(Boolean xenon) {
        this.xenon = xenon;
    }

    @Basic
    @Column(name = "pdc", columnDefinition = "TINYINT(1)")
    public Boolean getPdc() {
        return pdc;
    }

    public void setPdc(Boolean pdc) {
        this.pdc = pdc;
    }

    @Basic
    @Column(name = "ass_heating", columnDefinition = "TINYINT(1)")
    public Boolean getAssHeating() {
        return assHeating;
    }

    public void setAssHeating(Boolean assHeating) {
        this.assHeating = assHeating;
    }

    @Basic
    @Column(name = "asc", columnDefinition = "TINYINT(1)")
    public Boolean getAsc() {
        return asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    @Basic
    @Column(name = "navi", columnDefinition = "TINYINT(1)")
    public Boolean getNavi() {
        return navi;
    }

    public void setNavi(Boolean navi) {
        this.navi = navi;
    }

    @Basic
    @Column(name = "speakerphone", columnDefinition = "TINYINT(1)")
    public Boolean getSpeakerphone() {
        return speakerphone;
    }

    public void setSpeakerphone(Boolean speakerphone) {
        this.speakerphone = speakerphone;
    }

    @Basic
    @Column(name = "fog_lights", columnDefinition = "TINYINT(1)")
    public Boolean getFogLights() {
        return fogLights;
    }

    public void setFogLights(Boolean fogLights) {
        this.fogLights = fogLights;
    }

    @Basic
    @Column(name = "signaling", columnDefinition = "TINYINT(1)")
    public Boolean getSignaling() {
        return signaling;
    }

    public void setSignaling(Boolean signaling) {
        this.signaling = signaling;
    }
}
