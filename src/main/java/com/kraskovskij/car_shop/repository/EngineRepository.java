package com.kraskovskij.car_shop.repository;

import com.kraskovskij.car_shop.entities.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineRepository extends JpaRepository<Engine, Integer>{
}
