package com.kraskovskij.car_shop.service.implementations;

import com.kraskovskij.car_shop.entities.Gearbox;
import com.kraskovskij.car_shop.repository.GearboxRepository;
import com.kraskovskij.car_shop.service.interfaces.GearboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GearboxServiceImpl implements GearboxService{

    private final GearboxRepository gearboxRepository;

    @Autowired
    public GearboxServiceImpl(GearboxRepository gearboxRepository) {
        this.gearboxRepository = gearboxRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Gearbox> getAllGearboxes(){
        return gearboxRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Gearbox getGearboxById(Integer id) { return gearboxRepository.findOne(id); }
}
