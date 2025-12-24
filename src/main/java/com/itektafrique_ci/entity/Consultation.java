package com.itektafrique_ci.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "consultations")
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomComplet;

    @Column(nullable = false)
    private String entreprise;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String telephone;

    @Column(nullable = false)
    private LocalDate dateSouhaitee;

    @Column(nullable = false)
    private LocalTime heurePreferee;

    @Column(nullable = false)
    private String serviceSouhaite;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String message;

    // Getters & Setters
}

