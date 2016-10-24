package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.beans.models.CarModelBean;
import com.kraskovskij.car_shop.beans.models.EngineModelBean;
import com.kraskovskij.car_shop.entities.*;
import com.kraskovskij.car_shop.service.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("request")
public class NewCarBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @Autowired
    private MarkService markService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private CarService carService;

    @Autowired
    private EngineService engineService;

    @Autowired
    private EngineTypeService engineTypeService;

    @Autowired
    private TransmissionService transmissionService;

    @Autowired
    private PhotoService photoService;

    @Autowired
    MarkBean markBean;

    @Autowired
    EngineModelBean engineModelBean;

    @Autowired
    CarModelBean carModelBean;

    @Autowired
    CarBean carBean;

    @Autowired
    PhotoBean photoBean;

    public String saveCar(){
        Car car = new Car();
        car.setMarkTable(markService.getMarkById(carModelBean.getMarkId()));
        car.setModel(carModelBean.getModel());
        car.setMileage(carModelBean.getMileage());
        car.setTypeTable(typeService.getTypeById(carModelBean.getTypeId()));
        car.setDoors(carModelBean.getDoors());
        car.setYear(carModelBean.getYear());

        Engine engine = new Engine();
        engine.setEngineType(engineTypeService.getEngineTypeById(engineModelBean.getEngineTypeId()));
        engine.setVolume(engineModelBean.getVolume());
        engine.setHp(engineModelBean.getHp());
        engine.setNm(engineModelBean.getNm());
        engine.setTransmission(transmissionService.getTransmissionById(engineModelBean.getTransmissionId()));
        engineService.saveEngine(engine);

        car.setEngineTable(engine);
        car.setInformation(carModelBean.getInfo());
        car.setPrice(carModelBean.getPrice());
        carService.saveCar(car);

        photoBean.savePhotosToSystem();
        if(photoBean.getPhotos().size() > 0)
            for(Photo photo : photoBean.getPhotos()) {
                photo.setCar(car);
                photoService.savePhoto(photo);
                car.addPhoto(photo);
            }

        carBean.getAllCars().add(car);
        return "index";
    }

    //Getters and Setters
    public List<Integer> getYears(){
        List<Integer> years = new ArrayList<Integer>();
        for (int i = 2016; i >= 1960; i--)
            years.add(i);
        return years;
    }

    public List<Integer> getDoorsCount(){
        List<Integer> doorsCount = new ArrayList<Integer>();
        for (int i = 1; i < 6; i++)
            doorsCount.add(i);
        return doorsCount;
    }
}
