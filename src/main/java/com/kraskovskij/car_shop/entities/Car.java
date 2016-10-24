package com.kraskovskij.car_shop.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car", schema = "avtokomis")
public class Car implements Serializable{

    private static final long serialVersionUID = -5170875020617735653L;
    private int id;
    private double price;
    private int year;
    private String information;
    private String model;
    private int doors;
    private int mileage;

    //For ManyToOne relations
    private Mark markTable;
    private Type typeTable;
    private Engine engineTable;

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
    @Column(name = "price", nullable = false)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "year", nullable = false)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Basic
    @Column(name = "information", nullable = true, length = 250)
    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Basic
    @Column(name = "model", nullable = false, length = 45)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "doors")
    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Basic
    @Column(name = "mileage", nullable = false)
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mark_id", nullable = false)
    public Mark getMarkTable() {
        return markTable;
    }

    public void setMarkTable(Mark markTable) {
        this.markTable = markTable;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", nullable = false)
    public Type getTypeTable() {
        return typeTable;
    }

    public void setTypeTable(Type typeTable) {
        this.typeTable = typeTable;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "engine_id", nullable = false)
    public Engine getEngineTable() {
        return engineTable;
    }

    public void setEngineTable(Engine engineTable) {
        this.engineTable = engineTable;
    }

    //OneToMany Example
    private List<Photo> photos = new ArrayList<Photo>();

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "car")
    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public void addPhoto(Photo photo) {
        //photo.setCar(this);
        this.photos.add(photo);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", price=" + price +
                ", year=" + year +
                ", information='" + information + '\'' +
                ", markTable=" + markTable +
                ", typeTable=" + typeTable +
                ", engineTable=" + engineTable +
                '}';
    }
}
