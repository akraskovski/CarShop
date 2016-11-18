package com.kraskovskij.car_shop.service.implementations;

import com.kraskovskij.car_shop.entities.Car;
import com.kraskovskij.car_shop.repository.CarRepository;
import com.kraskovskij.car_shop.service.interfaces.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarServiceImpl implements CarService{

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Car> getCarsByParams(String mark, String type, String engineType, int stYear, int endYear,
                                     int stPrice, int endPrice, int stMileage, int endMileage){
        return carRepository.getCarsByParams(mark, type, engineType, stYear, endYear, stPrice, endPrice, stMileage, endMileage);
    }

    @Override
    public void saveCar(Car car){
        carRepository.save(car);
    }

    @Override
    public void deleteCar(Car car){
        carRepository.delete(car);
    }

    @Override
    public void updateCar(Car car) {
        carRepository.updateCarById(car.getModel(), car.getMileage(), car.getTypeTable(),
                car.getId(), car.getDoors(), car.getYear(), car.getInformation(), car.getPrice());
    }
}
