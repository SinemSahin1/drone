package com.example.demo.controller;

import com.example.demo.entity.Flight;
import com.example.demo.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")

public class FlightController {

  private final FlightService service;

  public FlightController(FlightService service) {
    this.service = service;
  }

  @PostMapping
  public Flight saveFlight(@RequestBody Flight flight) {
    return service.save(flight);
  }

  @GetMapping
  public List<Flight> getAllFlights() {
    return service.getAll();
  }
}
