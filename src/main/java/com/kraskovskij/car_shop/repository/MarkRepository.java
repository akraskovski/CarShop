package com.kraskovskij.car_shop.repository;

import com.kraskovskij.car_shop.entities.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MarkRepository extends JpaRepository<Mark, Integer> {
}
