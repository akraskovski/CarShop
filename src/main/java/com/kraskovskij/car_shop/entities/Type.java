package com.kraskovskij.car_shop.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "type", schema = "avtokomis")
public class Type implements Serializable{
    private static final long serialVersionUID = -5170875020617735653L;
    private int id;
    private String type;

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
    @Column(name = "type", nullable = false, length = 45)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
