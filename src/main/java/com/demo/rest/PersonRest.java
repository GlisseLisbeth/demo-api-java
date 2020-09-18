package com.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.dao.PersonDAO;
import com.demo.model.Person;

@RestController
@RequestMapping("persons")
public class PersonRest {

	@Autowired 
	private PersonDAO personDAO;
	
	@PostMapping("/save")		//{HOSTNAME}0/persons/save
	public void save(@RequestBody Person person) {
		personDAO.save(person);
	}
	
	@GetMapping("/all")
	public List<Person> list() {	//{HOSTNAME}/persons/all
		return personDAO.findAll();
	}
	
	@DeleteMapping("/delete/{id}")		//{HOSTNAME}/persons/delete/1
	public void delete(@PathVariable("id") Integer id) {
		personDAO.deleteById(id);
	}
	
	@PutMapping("/update")		//{HOSTNAME}/persons/update/1
	public void update(@RequestBody Person person) {
		personDAO.save(person);
	}
	
}
