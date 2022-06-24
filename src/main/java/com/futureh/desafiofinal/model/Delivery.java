package com.futureh.desafiofinal.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Delivery {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private String id;

  private Client client;

  private Location initialLocation;
  private Location finalLocation;

  private LocalDateTime initialDate;
  private LocalDateTime finalDate;

  private String status;

  public String getId() {
    return id;
  }

  public Location getInitialLocation() {
    return initialLocation;
  }

  public Location getFinalLocation() {
    return finalLocation;
  }

  public LocalDateTime getInitialDate() {
    return initialDate;
  }

  public LocalDateTime getFinalDate() {
    return finalDate;
  }

  public void setFinalDate(LocalDateTime finalDate) {
    this.finalDate = finalDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
