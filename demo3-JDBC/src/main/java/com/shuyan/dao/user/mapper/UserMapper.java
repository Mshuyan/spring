package com.shuyan.dao.user.mapper;

import com.shuyan.dao.user.bean.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    UserEntity getUser(String name);
    List<UserEntity> getUserList();
}
