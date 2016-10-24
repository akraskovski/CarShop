package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.Photo;

public interface PhotoService {

    void savePhoto(Photo photo);

    void deletePhoto(Photo photo);
}
