package com.example.gestioneViaggi.repository;


import com.example.gestioneViaggi.entity.Dipendente;
import com.example.gestioneViaggi.entity.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    boolean existsByEmployeeAndRequestDate(Dipendente employee, LocalDate requestDate);
}
