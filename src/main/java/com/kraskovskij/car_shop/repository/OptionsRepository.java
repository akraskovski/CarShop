package com.kraskovskij.car_shop.repository;


import com.kraskovskij.car_shop.entities.Options;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionsRepository extends JpaRepository<Options, Integer> {
}
