package com.example.projetoworkshopsbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoworkshopsbjava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
