package com.example.gestioneViaggi.repository;


import com.example.gestioneViaggi.entity.Dipendente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {
}
