package com.kraskovskij.car_shop.repository;

import com.kraskovskij.car_shop.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Integer> {
}
