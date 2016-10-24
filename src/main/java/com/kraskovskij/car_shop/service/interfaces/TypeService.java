package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.Type;

import java.util.List;

public interface TypeService {

    List<Type> getAllTypes();

    Type getTypeById(Integer id);
}
