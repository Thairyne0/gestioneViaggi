package com.example.gestioneViaggi.service;

import com.example.gestioneViaggi.entity.Dipendente;
import com.example.gestioneViaggi.exception.ResourceNotFoundException;
import com.example.gestioneViaggi.repository.DipendenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DipendenteService {
    @Autowired
    private DipendenteRepository dipendenteRepository;

    public List<Dipendente> getAllEmployees() {
        return dipendenteRepository.findAll();
    }

    public Dipendente getEmployeeById(Long id) {
        return dipendenteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Dipendente non trovato"));
    }

    public Dipendente createEmployee(Dipendente dipendente) {
        return dipendenteRepository.save(dipendente);
    }

    public Dipendente updateEmployee(Long id, Dipendente dettagliDipendente) {
        Dipendente dipendente = getEmployeeById(id);
        dipendente.setUsername(dettagliDipendente.getUsername());
        dipendente.setFirstName(dettagliDipendente.getFirstName());
        dipendente.setLastName(dettagliDipendente.getLastName());
        dipendente.setEmail(dettagliDipendente.getEmail());
        dipendente.setProfileImage(dettagliDipendente.getProfileImage());
        return dipendenteRepository.save(dipendente);
    }

    public void deleteEmployee(Long id) {
        dipendenteRepository.deleteById(id);
    }
}
