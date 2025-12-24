package com.itektafrique_ci.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ConsultationRequest {

    @NotBlank(message = "Le nom complet est obligatoire")
    private String nomComplet;

    @NotBlank(message = "L'entreprise est obligatoire")
    private String entreprise;

    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "Email invalide")
    private String email;

    @NotBlank(message = "Le téléphone est obligatoire")
    private String telephone;

    @NotNull(message = "La date souhaitée est obligatoire")
    private LocalDate dateSouhaitee;

    @NotNull(message = "L'heure préférée est obligatoire")
    private LocalTime heurePreferee;

    @NotBlank(message = "Le service souhaité est obligatoire")
    private String serviceSouhaite;

    @NotBlank(message = "Le message est obligatoire")
    private String message;

    // Getters & Setters
}
