package com.ease.servic;

import java.util.List;

import com.ease.model.User;

public interface UserServic {
	public void create(User user) ;
	public void update(User user) ;
	public User edit(Long userId);
	public void delete(Long userId);
	public User find(Long userId) ;
	public List<User> getAll() ;
	public List<User> findRole();
}

