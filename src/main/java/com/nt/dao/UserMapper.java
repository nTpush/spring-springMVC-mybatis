package com.nt.dao;

import com.nt.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {
    List<User> selectList();
}
