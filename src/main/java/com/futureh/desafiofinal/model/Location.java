package com.futureh.desafiofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

  private int latitude;
  private int longitude;

  // public Location(int latitude, int longitude) {
  //   this.latitude = latitude;
  //   this.longitude = longitude;
  // }

  public int getLatitude() {
    return latitude;
  }

  public void setLatitude(int latitude) {
    this.latitude = latitude;
  }

  public int getLongitude() {
    return longitude;
  }

  public void setLongitude(int longitude) {
    this.longitude = longitude;
  }

  public String getId() {
    return id;
  }
}
