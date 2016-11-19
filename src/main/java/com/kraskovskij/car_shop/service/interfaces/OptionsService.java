package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.Options;

public interface OptionsService {

    void saveOptions(Options options);

    void updateOptions(Options options);

    void deleteOptions(Options options);
}
