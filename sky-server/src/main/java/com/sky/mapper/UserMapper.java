package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {


    /**
     *
     * @param openid
     * @return
     */
    User getByOpenid(String openid);

    /**
     *
     * @param user
     */
    void insert(User user);
}
