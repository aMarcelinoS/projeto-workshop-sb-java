package com.example.projetoworkshopsbjava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetoworkshopsbjava.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResources {
	
	
	@GetMapping
	public ResponseEntity<User> FindAll(){
		User u = new User(1L, "Maria Silva", "maria@gmail.com","(99) 99999-9999", "12345");
		return ResponseEntity.ok().body(u);
	}
}
