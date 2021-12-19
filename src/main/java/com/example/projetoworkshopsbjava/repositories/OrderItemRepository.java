package com.example.projetoworkshopsbjava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetoworkshopsbjava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
