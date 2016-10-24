package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.entities.Mark;
import com.kraskovskij.car_shop.service.interfaces.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class MarkBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @Autowired
    MarkService markService;

    private List<Mark> allMarks;

    @PostConstruct
    public void init(){
        allMarks = markService.getAllMarks();
    }

    //Getters and Setters
    public List<Mark> getAllMarks() {
        return allMarks;
    }
}
