package com.example.gestioneViaggi.entity;


import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Data
@Entity
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate requestDate;
    private String notes;

    @ManyToOne
    @JoinColumn(name = "travel_id")
    private Viaggio travel;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Dipendente employee;
}
