package com.kraskovskij.car_shop.service.implementations;

import com.kraskovskij.car_shop.entities.Engine;
import com.kraskovskij.car_shop.repository.EngineRepository;
import com.kraskovskij.car_shop.service.interfaces.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EngineServiceImpl implements EngineService{

    private final EngineRepository engineRepository;

    @Autowired
    public EngineServiceImpl(EngineRepository engineRepository) {
        this.engineRepository = engineRepository;
    }

    @Override
    public void saveEngine(Engine engine){
        engineRepository.save(engine);
    }

    @Override
    public void deleteEngine(Engine engine){
        engineRepository.delete(engine);
    }
}
