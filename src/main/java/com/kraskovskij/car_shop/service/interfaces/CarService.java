package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.Car;
import com.kraskovskij.car_shop.entities.Mark;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    List<Car> getCarsByParams(String mark, int stYear, int endYear, double stPrice, double endPrice);

    void saveCar(Car car);

    void deleteCar(Car car);
}
