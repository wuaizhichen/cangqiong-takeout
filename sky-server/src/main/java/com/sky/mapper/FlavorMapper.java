package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 君禾
 * @version 1.0
 */
@Mapper
public interface FlavorMapper {
    /**
     * 查询菜品
     * @param dishId
     * @return
     */
    

    /**
     * 添加口味
     * @param flavors
     * @param id
     */
    void insertBatch(List<DishFlavor> flavors, Long id);

    /**
     * 删除口味
     * @param ids
     */
    void deleteBatch(List<Long> ids);

    List<DishFlavor> getByDishId(Long dishId);
}
