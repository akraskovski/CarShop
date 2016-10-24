package com.kraskovskij.car_shop.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "transmission", schema = "avtokomis")
public class Transmission implements Serializable{
    private static final long serialVersionUID = -5170875020617735653L;
    private int id;
    private String transmission;

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
    @Column(name = "transmission", nullable = false, length = 45)
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "id=" + id +
                ", transmission='" + transmission + '\'' +
                '}';
    }
}
