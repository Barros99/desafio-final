package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Drone;
import com.example.demo.repository.DroneRepository;

@Service
public class DroneService {

  @Autowired
  private DroneRepository droneRepository;

  public List<Drone> findAll() {
    return droneRepository.findAll();
  }

  public Drone findById(Integer id) {
    Optional<Drone> drone = droneRepository.findById(id);
    return drone.get();
  }

  public Drone create(Drone drone) {
    return droneRepository.save(drone);
  }

  public void update(Integer id, Drone drone) {
    Optional<Drone> droneOp = droneRepository.findById(id);

    Drone droneOld = droneOp.get();
    droneOld.setLatitude(drone.getLatitude());
    droneOld.setLongitude(drone.getLongitude());
    droneOld.setStatus(drone.getStatus());
    droneOld.setDataEntrega(drone.getDataEntrega());

    droneRepository.save(droneOld);
  }

}
