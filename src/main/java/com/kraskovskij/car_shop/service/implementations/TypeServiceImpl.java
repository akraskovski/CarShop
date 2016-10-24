package com.kraskovskij.car_shop.service.implementations;

import com.kraskovskij.car_shop.entities.Type;
import com.kraskovskij.car_shop.repository.TypeRepository;
import com.kraskovskij.car_shop.service.interfaces.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TypeServiceImpl implements TypeService{

    private final TypeRepository typeRepository;

    @Autowired
    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Type> getAllTypes(){
        return typeRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Type getTypeById(Integer id) { return typeRepository.findOne(id); }
}
