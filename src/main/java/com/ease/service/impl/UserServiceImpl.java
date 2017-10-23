package com.ease.service.impl;

import java.util.List;

import com.ease.doa.UserDao;
import com.ease.model.User;
import com.ease.servic.UserServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserServic{

	@Autowired
	UserDao userDao;
	@Override
	public void create(User user) {
		userDao.create(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User edit(Long userId) {
		return userDao.edit(userId);
	}

	@Override
	public void delete(Long userId) {
		userDao.delete(userId);
	}

	@Override
	public User find(Long userId) {
		return userDao.find(userId);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	public List<User> findRole(){
		return userDao.findRole();
	}
}
