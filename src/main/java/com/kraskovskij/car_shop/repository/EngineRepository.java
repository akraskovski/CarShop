package com.kraskovskij.car_shop.repository;

import com.kraskovskij.car_shop.entities.Engine;
import com.kraskovskij.car_shop.entities.EngineType;
import com.kraskovskij.car_shop.entities.Transmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EngineRepository extends JpaRepository<Engine, Integer>{

    @Modifying
    @Query("update Engine e set e.engineType = :engineType, e.volume = :volume, e.hp = :hp," +
            "e.nm = :nm, e.transmission = :transmission where e.id = :id")
    void updateEngineById(@Param("id")Integer id, @Param("engineType")EngineType engineType,
                          @Param("volume")Integer volume, @Param("hp")Integer hp,
                          @Param("nm")Integer nm, @Param("transmission")Transmission transmission);
}
