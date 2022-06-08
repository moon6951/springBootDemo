package com.example.dao;

import com.example.entity.TUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    List<TUser> queryAll();
}
