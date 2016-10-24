package com.kraskovskij.car_shop.beans;

import com.kraskovskij.car_shop.entities.Transmission;
import com.kraskovskij.car_shop.service.interfaces.TransmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Component
@Scope("request")
public class TransmissionBean implements Serializable{

    private static final long serialVersionUID = 1L;

    @Autowired
    TransmissionService transmissionService;

    private List<Transmission> allTransmissions;

    public TransmissionBean(TransmissionService transmissionService) {
        this.transmissionService = transmissionService;
    }

    @PostConstruct
    public void init(){
        allTransmissions = transmissionService.getAllTransmissions();
    }

    //Getters ans Setters
    public List<Transmission> getAllTransmissions() {
        return allTransmissions;
    }
}
