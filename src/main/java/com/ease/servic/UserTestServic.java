package com.ease.servic;

import java.util.List;

import com.ease.model.UserTest;

public interface UserTestServic {
	public void create(UserTest user) ;
	public void update(UserTest user) ;
	public UserTest edit(Long userId);
	public void delete(Long userId);
	public UserTest find(Long userId) ;
	public List<UserTest> getAll() ;
	public List<UserTest> findRole();
}

