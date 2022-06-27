package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Drone;

@Repository
public interface DroneRepository extends JpaRepository<Drone, Integer> {
}
