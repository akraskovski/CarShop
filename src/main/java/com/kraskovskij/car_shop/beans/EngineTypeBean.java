package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.entities.EngineType;
import com.kraskovskij.car_shop.service.interfaces.EngineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
@Scope("request")
public class EngineTypeBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @Autowired
    EngineTypeService engineTypeService;

    private List<EngineType> allEngineTypes;

    public EngineTypeBean(EngineTypeService engineTypeService) {
        this.engineTypeService = engineTypeService;
    }

    @PostConstruct
    public void init(){
        allEngineTypes = engineTypeService.getAllEngineTypes();
    }

    //Getters and Setters
    public List<EngineType> getAllEngineTypes() {
        return allEngineTypes;
    }
}
