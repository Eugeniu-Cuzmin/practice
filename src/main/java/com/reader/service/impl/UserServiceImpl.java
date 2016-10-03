package com.reader.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.reader.model.User;
import com.reader.repository.UserRepository;
import com.reader.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Integer id) {
		return userRepository.findOne(id);
	}

}
