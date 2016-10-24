package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.entities.Type;
import com.kraskovskij.car_shop.service.interfaces.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
@Scope("request")
public class TypeBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @Autowired
    private final TypeService typeService;

    private List<Type> allTypes;

    public TypeBean(TypeService typeService) {
        this.typeService = typeService;
    }

    @PostConstruct
    public void init(){
        allTypes = typeService.getAllTypes();
    }

    //Getters and Setters
    public List<Type> getAllTypes() {
        return allTypes;
    }
}
