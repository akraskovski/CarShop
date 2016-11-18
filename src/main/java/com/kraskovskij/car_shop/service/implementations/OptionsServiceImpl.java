package com.kraskovskij.car_shop.service.implementations;

import com.kraskovskij.car_shop.entities.Options;
import com.kraskovskij.car_shop.repository.OptionsRepository;
import com.kraskovskij.car_shop.service.interfaces.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OptionsServiceImpl implements OptionsService {

    private final OptionsRepository optionsRepository;

    @Autowired
    public OptionsServiceImpl(OptionsRepository optionsRepository) {
        this.optionsRepository = optionsRepository;
    }

    @Override
    public void saveOptions(Options options) {
        optionsRepository.save(options);
    }
}
