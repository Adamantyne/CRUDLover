package com.modela_ai.modela_ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modela_ai.modela_ai.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
    
}
