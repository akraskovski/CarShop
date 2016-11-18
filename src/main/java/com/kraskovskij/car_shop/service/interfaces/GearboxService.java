package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.Gearbox;

import java.util.List;

public interface GearboxService {

    List<Gearbox> getAllGearboxes();

    Gearbox getGearboxById(Integer id);
}
