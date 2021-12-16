package com.example.projetoworkshopsbjava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoworkshopsbjava.entities.User;
import com.example.projetoworkshopsbjava.services.UserService;

@RestController
@RequestMapping (value = "/users")
public class UserResources {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> FindAll(){
		List <User> list = service.FindAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> FindById(@PathVariable Long id){
		User obj = service.FindById(id);
		return ResponseEntity.ok().body(obj);
	}	
}
