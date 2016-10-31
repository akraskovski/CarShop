package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.Engine;

public interface EngineService {

    void saveEngine(Engine engine);

    void deleteEngine(Engine engine);

    void updateEngine(Engine engine);
}
