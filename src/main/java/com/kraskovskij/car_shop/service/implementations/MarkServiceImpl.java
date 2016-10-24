package com.kraskovskij.car_shop.service.implementations;

import com.kraskovskij.car_shop.entities.Mark;
import com.kraskovskij.car_shop.repository.MarkRepository;
import com.kraskovskij.car_shop.service.interfaces.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MarkServiceImpl implements MarkService {

    private final MarkRepository markRepository;

    @Autowired
    public MarkServiceImpl(MarkRepository markRepository) {
        this.markRepository = markRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Mark> getAllMarks(){
       return markRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Mark getMarkById(Integer id){
        return markRepository.findOne(id);
    }

    @Override
    public void saveMark(final Mark mark){
        markRepository.save(mark);
    }
}
