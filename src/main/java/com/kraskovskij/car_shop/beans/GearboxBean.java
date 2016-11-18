package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.entities.Gearbox;
import com.kraskovskij.car_shop.service.interfaces.GearboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
@Scope("request")
public class GearboxBean implements Serializable {
    private static final long serialVersionUID = 1L;

    @Autowired
    GearboxService gearboxService;

    private List<Gearbox> allGearboxes;

    @PostConstruct
    public void init(){
        allGearboxes = gearboxService.getAllGearboxes();
    }

    //Getters and Setters
    public List<Gearbox> getAllGearboxes() {
        return allGearboxes;
    }

}
