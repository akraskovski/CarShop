package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.entities.Car;
import com.kraskovskij.car_shop.entities.Mark;
import com.kraskovskij.car_shop.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
@Scope("request")
public class CarSearchBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @Autowired
    private CarService carService;

    private String mark;
    private int stYear = 1960;
    private int endYear = 2016;
    private double stPrice = 0;
    private double endPrice = 100000;

    public List<Car> getFindCars(){
        return carService.getCarsByParams(mark, stYear, endYear, stPrice, endPrice);
    }

    //Getters and Setters
    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
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
}
