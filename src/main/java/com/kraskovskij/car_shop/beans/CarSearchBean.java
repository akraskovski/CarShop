package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.entities.Car;
import com.kraskovskij.car_shop.entities.Mark;
import com.kraskovskij.car_shop.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
public class CarSearchBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @Autowired
    private CarService carService;

    private String mark;
    private String type;
    private String engineType;
    private int stYear;
    private int endYear;
    private double stPrice;
    private double endPrice;
    private int stMileage;
    private int endMileage;
    private List<Car> findCarsByParams;

    @PostConstruct
    public void init(){
        mark = "";
        type = "";
        engineType = "";
        stYear = 1960;
        endYear = 2016;
        stPrice = 0;
        endPrice = 100000;
        stMileage = 0;
        endMileage = 500000;
    }

    public String findCars(){
        findCarsByParams = carService.getCarsByParams(mark, type, engineType, stYear, endYear, stPrice, endPrice, stMileage, endMileage);
        init();
        return "find-cars?faces-redirect=true";
    }

    public String findCarsAdmin(){
        findCarsByParams = carService.getCarsByParams(mark, type, engineType, stYear, endYear, stPrice, endPrice, stMileage, endMileage);
        init();
        return "admin-find-cars?faces-redirect=true";
    }

    //Getters and Setters
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStYear() {
        return stYear;
    }

    public void setStYear(int stYear) {
        this.stYear = stYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public double getStPrice() {
        return stPrice;
    }

    public void setStPrice(double stPrice) {
        this.stPrice = stPrice;
    }

    public double getEndPrice() {
        return endPrice;
    }

    public void setEndPrice(double endPrice) {
        this.endPrice = endPrice;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getStMileage() {
        return stMileage;
    }

    public void setStMileage(int stMileage) {
        this.stMileage = stMileage;
    }

    public int getEndMileage() {
        return endMileage;
    }

    public void setEndMileage(int endMileage) {
        this.endMileage = endMileage;
    }

    public List<Car> getFindCarsByParams() {
        return findCarsByParams;
    }

    public void setFindCarsByParams(List<Car> findCarsByParams) {
        this.findCarsByParams = findCarsByParams;
    }
}
