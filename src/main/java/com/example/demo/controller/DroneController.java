package com.example.demo.controller;

import com.example.demo.entity.Drone;
import com.example.demo.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drones")

public class DroneController {

    @Autowired
    private DroneRepository droneRepository;

    // Drone bilgilerini kaydet
    @PostMapping("/info")
    public Drone saveDrone(@RequestBody Drone drone) {
        return droneRepository.save(drone);
    }

    // Kayıtlı droneları listele
    @GetMapping("/info")
    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }
}
