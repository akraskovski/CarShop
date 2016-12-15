package com.kraskovskij.car_shop.beans;


import com.kraskovskij.car_shop.entities.Car;
import com.kraskovskij.car_shop.entities.Photo;
import com.kraskovskij.car_shop.service.interfaces.CarService;
import com.kraskovskij.car_shop.service.interfaces.EngineService;
import com.kraskovskij.car_shop.service.interfaces.OptionsService;
import com.kraskovskij.car_shop.service.interfaces.PhotoService;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
@Scope("session")
public class CarBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @Autowired
    CarService carService;

    @Autowired
    EngineService engineService;

    @Autowired
    OptionsService optionsService;

    @Autowired
    PhotoService photoService;

    private List<Car> allCars;
    private Car selectedCar;
    private MapModel simpleModel;

    @PostConstruct
    public void init() {
        allCars = carService.getAllCars();
        simpleModel = new DefaultMapModel();
        LatLng coord = new LatLng(53.68479341, 23.83977795);
        simpleModel.addOverlay(new Marker(coord, "Address"));
    }

    //Getters and Setters
    public List<Car> getAllCars() {
        return allCars;
    }

    public Car getSelectedCar() {
        return selectedCar;
    }

    public void setSelectedCar(Car selectedCar) {
        this.selectedCar = selectedCar;
    }

    public MapModel getSimpleModel() {
        return simpleModel;
    }

    public String getFirstPhoto(Car car) {
        if (car.getPhotos().size() > 0)
            return car.getPhotos().get(0).getPath();
        else
            return "noimage.jpg";
    }

    public String deleteCar() {
        for (Photo photo : selectedCar.getPhotos()) {
            File file = new File("E:\\CarShop\\src\\main\\webapp\\resources\\images\\" + photo.getPath());
            if (file.delete())
                System.out.println(photo.getPath() + " delete sucessfull");
            else
                System.out.println("file not found");
        }
        carService.deleteCar(selectedCar);
        engineService.deleteEngine(selectedCar.getEngineTable());
        optionsService.deleteOptions(selectedCar.getOptions());

        allCars.remove(selectedCar);
        selectedCar = null;
        return "admin-index?faces-redirect=true";
    }

    public String updateCar() {
        engineService.updateEngine(selectedCar.getEngineTable());
        optionsService.updateOptions(selectedCar.getOptions());
        carService.updateCar(selectedCar);
        return "admin-index";
    }

    public List<Car> getSortedCars(){
        List<Car> sort = allCars;
        Collections.reverse(sort);
        return sort;
    }
}
