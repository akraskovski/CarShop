package com.kraskovskij.car_shop.service.implementations;

import com.kraskovskij.car_shop.entities.EngineType;
import com.kraskovskij.car_shop.repository.EngineTypeRepository;
import com.kraskovskij.car_shop.service.interfaces.EngineTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EngineTypeServiceImpl implements EngineTypeService{

    private final EngineTypeRepository engineTypeRepository;

    @Autowired
    public EngineTypeServiceImpl(EngineTypeRepository engineTypeRepository) {
        this.engineTypeRepository = engineTypeRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<EngineType> getAllEngineTypes(){
        return engineTypeRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public EngineType getEngineTypeById(Integer id){
        return engineTypeRepository.findOne(id);
    }
}
