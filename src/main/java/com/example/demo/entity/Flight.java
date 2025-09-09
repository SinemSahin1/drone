package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "startx", nullable = false)
    private Double startx;   // Başlangıç longitude

    @Column(name = "starty", nullable = false)
    private Double starty;   // Başlangıç latitude

    @Column(name = "endx", nullable = false)
    private Double endx;     // Bitiş longitude

    @Column(name = "endy", nullable = false)
    private Double endy;     // Bitiş latitude

    @Column(name = "distance", nullable = false)
    private Double distance; // Uçuş mesafesi (km)

    // ---- Getter & Setter ----
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getStartx() {
        return startx;
    }

    public void setStartx(Double startx) {
        this.startx = startx;
    }

    public Double getStarty() {
        return starty;
    }

    public void setStarty(Double starty) {
        this.starty = starty;
    }

    public Double getEndx() {
        return endx;
    }

    public void setEndx(Double endx) {
        this.endx = endx;
    }

    public Double getEndy() {
        return endy;
    }

    public void setEndy(Double endy) {
        this.endy = endy;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }
}
