package com.reader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reader.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
