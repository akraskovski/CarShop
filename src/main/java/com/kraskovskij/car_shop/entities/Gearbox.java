package com.kraskovskij.car_shop.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "gearbox", schema = "carshop")
public class Gearbox implements Serializable {

    private static final long serialVersionUID = -5170875020617735653L;
    private int id;
    private String name;

    public Gearbox() {
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
