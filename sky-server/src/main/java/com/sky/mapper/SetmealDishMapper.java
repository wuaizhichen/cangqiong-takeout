package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 君禾
 * @version 1.0
 */
@Mapper
public interface SetmealDishMapper {


    void delete(Long categoryId);

    void insert(List<SetmealDish> setmealDishes);

    List<SetmealDish> getById(Long id);
}
