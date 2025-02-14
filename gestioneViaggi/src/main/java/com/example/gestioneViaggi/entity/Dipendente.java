package com.example.gestioneViaggi.entity;


import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.Id;

import java.util.List;

@Data
@Entity
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String profileImage;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Prenotazione> bookings;
}
