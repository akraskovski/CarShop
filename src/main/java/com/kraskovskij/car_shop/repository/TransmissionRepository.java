package com.kraskovskij.car_shop.repository;

import com.kraskovskij.car_shop.entities.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransmissionRepository extends JpaRepository<Transmission, Integer> {
}
