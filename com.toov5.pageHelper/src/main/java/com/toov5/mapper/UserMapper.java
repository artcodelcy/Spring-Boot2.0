package com.toov5.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.toov5.entity.User;

public interface UserMapper {
	@Select("SELECT * FROM USERS ")
	List<User> findUserList();
}
