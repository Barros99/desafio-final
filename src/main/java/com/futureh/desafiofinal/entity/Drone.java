package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Drone {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

  private Integer latitude;

  private Integer longitude;

  private Integer dataRetirada;

  private Integer dataEntrega;

  private String status;

  public Drone(Integer latitude, Integer longitude, Integer dataRetirada, Integer dataEntrega, String status) {
    this.latitude = latitude;
    this.longitude = longitude;
    this.dataRetirada = dataRetirada;
    this.dataEntrega = dataEntrega;
    this.status = status;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integer getLatitude() {
    return latitude;
  }

  public void setLatitude(Integer latitude) {
    this.latitude = latitude;
  }

  public Integer getLongitude() {
    return longitude;
  }

  public void setLongitude(Integer longitude) {
    this.longitude = longitude;
  }

  public Integer getDataRetirada() {
    return dataRetirada;
  }

  public void setDataRetirada(Integer dataRetirada) {
    this.dataRetirada = dataRetirada;
  }

  public Integer getDataEntrega() {
    return dataEntrega;
  }

  public void setDataEntrega(Integer dataEntrega) {
    this.dataEntrega = dataEntrega;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
