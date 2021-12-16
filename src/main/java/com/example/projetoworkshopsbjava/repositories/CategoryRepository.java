package com.example.projetoworkshopsbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoworkshopsbjava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
		
}
