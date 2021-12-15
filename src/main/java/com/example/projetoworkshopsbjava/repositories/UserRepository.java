package com.example.projetoworkshopsbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoworkshopsbjava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	
	
}
