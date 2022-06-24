package com.futureh.desafiofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drone extends Location {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

  private Location initialLocation;
  private Location currentLocation;
  private Location finalLocation;

  private String status;

  public Drone(Location initialLocation, Location finalLocation) {
    this.initialLocation = initialLocation;
    this.finalLocation = finalLocation;
  }
}
