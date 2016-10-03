package com.reader.service;

import java.util.List;

import com.reader.model.User;

public interface UserService {
	public User addUser(User user);

	public List<User> findAll();

	public User getUserById(Integer id);
}
