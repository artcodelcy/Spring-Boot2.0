package com.toov5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.toov5.entity.User;
import com.toov5.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	//当前页 一页多少个  mysql通过limit分页的哈
	public PageInfo<User> findUserList(int page, int size) {
		// 开启分页插件,放在查询语句上面 帮助生成分页语句
		PageHelper.startPage(page, size); //底层实现原理采用改写语句   将下面的方法中的sql语句获取到然后做个拼接 limit  AOPjishu 
		List<User> listUser = userMapper.findUserList();
		// 封装分页之后的数据  返回给客户端展示  PageInfo做了一些封装 作为一个类
		PageInfo<User> pageInfoUser = new PageInfo<User>(listUser);
		return pageInfoUser;
	}

}
