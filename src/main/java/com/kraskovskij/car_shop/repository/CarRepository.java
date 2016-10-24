package com.kraskovskij.car_shop.repository;

import com.kraskovskij.car_shop.entities.Car;
import com.kraskovskij.car_shop.entities.Mark;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer>{

    @Query("select c from Car c where (c.markTable.mark = :mark or '' = :mark) " +
            "and (c.year between :stYear and :endYear) " +
            "and (c.price between :stPrice and :endPrice)")
    List<Car> getCarsByParams(@Param("mark")String mark,
                              @Param("stYear")int stYear,
                              @Param("endYear")int endYear,
                              @Param("stPrice")double stPrice,
                              @Param("endPrice")double endPrice);
}
