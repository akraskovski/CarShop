package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.EngineType;

import java.util.List;

public interface EngineTypeService {

    List<EngineType> getAllEngineTypes();

    EngineType getEngineTypeById(Integer id);
}
