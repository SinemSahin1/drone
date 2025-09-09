package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
@Table(name = "drone_route")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DroneRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer droneId;   // primitive yerine wrapper
    private Double distance;   // null güvenli
    private Double fuel;       // null güvenli
    private String weather;

    @Column(columnDefinition = "TEXT") // JSON/koordinat listesi string olarak tutulacak
    private String points;
}
