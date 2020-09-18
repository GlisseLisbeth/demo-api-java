package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Person;

public interface PersonDAO extends JpaRepository<Person, Integer>{
	
}
