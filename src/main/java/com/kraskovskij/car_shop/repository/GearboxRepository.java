package com.kraskovskij.car_shop.repository;

import com.kraskovskij.car_shop.entities.Gearbox;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GearboxRepository extends JpaRepository<Gearbox, Integer> {
}
