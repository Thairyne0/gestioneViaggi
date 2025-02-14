package com.example.gestioneViaggi.service;


import com.example.gestioneViaggi.entity.Viaggio;
import com.example.gestioneViaggi.exception.ResourceNotFoundException;
import com.example.gestioneViaggi.repository.ViaggioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViaggioService {
    @Autowired
    private ViaggioRepository dipendenteRepository;

    public List<Viaggio> getAllTravels() {
        return dipendenteRepository.findAll();
    }

    public Viaggio getTravelById(Long id) {
        return dipendenteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Viaggio non tovato"));
    }

    public Viaggio createViaggio(Viaggio viaggio) {
        return dipendenteRepository.save(viaggio);
    }

    public Viaggio updateTravel(Long id, Viaggio dettagliViaggio) {
        Viaggio viaggio = getTravelById(id);
        viaggio.setDestination(dettagliViaggio.getDestination());
        viaggio.setDate(dettagliViaggio.getDate());
        viaggio.setStatus(dettagliViaggio.getStatus());
        return dipendenteRepository.save(viaggio);
    }

    public void deleteTravel(Long id) {
        dipendenteRepository.deleteById(id);
    }
}
