package com.kraskovskij.car_shop.service.implementations;

import com.kraskovskij.car_shop.entities.Transmission;
import com.kraskovskij.car_shop.repository.TransmissionRepository;
import com.kraskovskij.car_shop.service.interfaces.TransmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TransmissionServiceImpl implements TransmissionService{

    private final TransmissionRepository transmissionRepository;

    @Autowired
    public TransmissionServiceImpl(TransmissionRepository transmissionRepository) {
        this.transmissionRepository = transmissionRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Transmission> getAllTransmissions(){
        return transmissionRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Transmission getTransmissionById(Integer id){ return transmissionRepository.findOne(id); }
}
