package com.kraskovskij.car_shop.repository;

import com.kraskovskij.car_shop.entities.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}
