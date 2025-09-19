package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "drones")
public class Drone {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String droneId;
  private String model;
  private Double maxDistance;
  private Double fuelCapacity;
  private Double startX;
  private Double startY;
}
