package com.itektafrique_ci.controller;

import com.itektafrique_ci.dto.ConsultationRequest;
import com.itektafrique_ci.entity.Consultation;
import com.itektafrique_ci.service.ConsultationService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/consultations")
@CrossOrigin(origins = "*") // utile pour React / Angular / Vue
public class ConsultationController {

    private final ConsultationService service;

    public ConsultationController(ConsultationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Consultation> creerConsultation(
            @Valid @RequestBody ConsultationRequest request
    ) {
        Consultation saved = service.enregistrer(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot GET API FROM ITEKT!";
    }
}
