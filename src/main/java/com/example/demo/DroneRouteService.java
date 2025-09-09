package com.example.demo.service;

import com.example.demo.entity.DroneRoute;
import com.example.demo.repository.DroneRouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneRouteService {

    private final DroneRouteRepository repository;

    public DroneRouteService(DroneRouteRepository repository) {
        this.repository = repository;
    }

    public DroneRoute save(DroneRoute route) {
        return repository.save(route);
    }

    public List<DroneRoute> getAll() {
        return repository.findAll();
    }
}
