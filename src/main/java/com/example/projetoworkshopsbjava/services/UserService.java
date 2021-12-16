package com.example.projetoworkshopsbjava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetoworkshopsbjava.entities.User;
import com.example.projetoworkshopsbjava.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> FindAll (){
		return repository.findAll();
	}	
	
	public User FindById(Long id){
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}