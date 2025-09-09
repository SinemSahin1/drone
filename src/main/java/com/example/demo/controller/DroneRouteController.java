package com.example.demo.controller;

import com.example.demo.entity.DroneRoute;
import com.example.demo.service.DroneRouteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drones")
public class DroneRouteController {

    private final DroneRouteService routeService;

    public DroneRouteController(DroneRouteService routeService) {
        this.routeService = routeService;
    }

    @PostMapping("/route")
    public DroneRoute saveRoute(@RequestBody DroneRoute route) {
        return routeService.save(route);
    }

    @GetMapping("/route")
    public List<DroneRoute> getAllRoutes() {
        return routeService.getAll();
    }
}
