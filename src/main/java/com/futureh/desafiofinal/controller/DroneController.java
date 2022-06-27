package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Drone;
import com.example.demo.service.DroneService;

@RestController
@RequestMapping("/drone")
public class DroneController {

  @Autowired
  private DroneService droneService;

  @GetMapping
  public ResponseEntity<List<Drone>> findAll() {
    return ResponseEntity.ok(droneService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Drone> findById(@PathVariable Integer id) {
    return ResponseEntity.ok(droneService.findById(id));
  }

  @PostMapping
  public ResponseEntity<Drone> create(Drone drone) {
    return ResponseEntity.ok(droneService.create(drone));
  }

  @PutMapping("/{id}")
  public ResponseEntity update(@PathVariable Integer id, Drone drone) {
    droneService.update(id, drone);
    return ResponseEntity.ok().build();
  }

}
