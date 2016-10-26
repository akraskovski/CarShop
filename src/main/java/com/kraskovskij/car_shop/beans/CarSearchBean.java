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
    private int stYear;
    private int endYear;
    private double stPrice;
    private double endPrice;
    private List<Car> findCarsByParams;

    @PostConstruct
    public void init(){
        mark = "";
        stYear = 1960;
        endYear = 2016;
        stPrice = 0;
        endPrice = 100000;
    }

    public String findCars(){
        findCarsByParams = carService.getCarsByParams(mark, stYear, endYear, stPrice, endPrice);
        return "findCars?faces-redirect=true";
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

    public List<Car> getFindCarsByParams() {
        return findCarsByParams;
    }

    public void setFindCarsByParams(List<Car> findCarsByParams) {
        this.findCarsByParams = findCarsByParams;
    }
}
