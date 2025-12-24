package com.itektafrique_ci.service;

import com.itektafrique_ci.dto.ConsultationRequest;
import com.itektafrique_ci.entity.Consultation;
import com.itektafrique_ci.repository.ConsultationRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultationService {

    private final ConsultationRepository repository;

    public ConsultationService(ConsultationRepository repository) {
        this.repository = repository;
    }

    public Consultation enregistrer(ConsultationRequest request) {

        Consultation consultation = new Consultation();
        consultation.setNomComplet(request.getNomComplet());
        consultation.setEntreprise(request.getEntreprise());
        consultation.setEmail(request.getEmail());
        consultation.setTelephone(request.getTelephone());
        consultation.setDateSouhaitee(request.getDateSouhaitee());
        consultation.setHeurePreferee(request.getHeurePreferee());
        consultation.setServiceSouhaite(request.getServiceSouhaite());
        consultation.setMessage(request.getMessage());

        return repository.save(consultation);
    }
}
