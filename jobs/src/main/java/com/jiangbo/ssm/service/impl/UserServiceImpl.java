package com.jiangbo.ssm.service.impl;

import com.jiangbo.ssm.entity.User;
import com.jiangbo.ssm.mapper.UserMapper;
import com.jiangbo.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUserById(Integer userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
