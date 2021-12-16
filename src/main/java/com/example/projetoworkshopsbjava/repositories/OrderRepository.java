package com.example.projetoworkshopsbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoworkshopsbjava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
		
}
