package com.kraskovskij.car_shop.service.interfaces;

import com.kraskovskij.car_shop.entities.Mark;

import java.util.List;

public interface MarkService {

    List<Mark> getAllMarks();

    Mark getMarkById(Integer id);

    void saveMark(final Mark mark);
}
