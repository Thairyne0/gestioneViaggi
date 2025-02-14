package com.example.gestioneViaggi.repository;



import com.example.gestioneViaggi.entity.Viaggio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViaggioRepository extends JpaRepository<Viaggio, Long> {
}
