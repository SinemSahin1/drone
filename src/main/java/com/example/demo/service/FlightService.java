package com.example.demo.service;

import com.example.demo.entity.Flight;
import com.example.demo.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository repository;

    public FlightService(FlightRepository repository) {
        this.repository = repository;
    }

    public Flight save(Flight flight) {


        double dx = flight.getEndx() - flight.getStartx();
        double dy = flight.getEndy() - flight.getStarty();
        double distance = Math.sqrt(dx * dx + dy * dy);

        flight.setDistance(distance);
        return repository.save(flight);
    }

    public List<Flight> getAll() {
        return repository.findAll();
    }
}
