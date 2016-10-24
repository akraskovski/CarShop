package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.Transmission;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TransmissionService {

    List<Transmission> getAllTransmissions();

    Transmission getTransmissionById(Integer id);
}
