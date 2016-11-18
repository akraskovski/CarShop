package com.kraskovskij.car_shop.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "engine", schema = "carshop")
public class Engine implements Serializable {
    private static final long serialVersionUID = -5170875020617735653L;
    private int id;
    private int volume;
    private Integer hp;
    private Integer nm;

    //For ManyToOne relations
    private Transmission transmission;
    private EngineType engineType;

    public Engine() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "volume")
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Basic
    @Column(name = "hp", nullable = true)
    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    @Basic
    @Column(name = "nm", nullable = true)
    public Integer getNm() {
        return nm;
    }

    public void setNm(Integer nm) {
        this.nm = nm;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transmission_id", nullable = false)
    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "engine_type_id", nullable = false)
    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", volume=" + volume +
                ", hp=" + hp +
                ", nm=" + nm +
                ", transmission=" + transmission +
                ", engineType=" + engineType +
                '}';
    }
}
