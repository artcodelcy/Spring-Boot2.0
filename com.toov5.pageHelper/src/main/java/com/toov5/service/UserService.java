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
	//��ǰҳ һҳ���ٸ�  mysqlͨ��limit��ҳ�Ĺ�
	public PageInfo<User> findUserList(int page, int size) {
		// ������ҳ���,���ڲ�ѯ������� �������ɷ�ҳ���
		PageHelper.startPage(page, size); //�ײ�ʵ��ԭ����ø�д���   ������ķ����е�sql����ȡ��Ȼ������ƴ�� limit  AOPjishu 
		List<User> listUser = userMapper.findUserList();
		// ��װ��ҳ֮�������  ���ظ��ͻ���չʾ  PageInfo����һЩ��װ ��Ϊһ����
		PageInfo<User> pageInfoUser = new PageInfo<User>(listUser);
		return pageInfoUser;
	}

}
