package com.example.gestioneViaggi.controller;

import com.example.gestioneViaggi.entity.Viaggio;
import com.example.gestioneViaggi.service.ViaggioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/viaggi")
public class ViaggioController {
    @Autowired
    private ViaggioService travelService;

    @GetMapping
    public List<Viaggio> getAllTravels() {
        return travelService.getAllTravels();
    }

    @GetMapping("/{id}")
    public Viaggio getTravelById(@PathVariable Long id) {
        return travelService.getTravelById(id);
    }

    @PostMapping
    public Viaggio createTravel(@RequestBody Viaggio viaggio) {
        return travelService.createViaggio(viaggio);
    }

    @PutMapping("/{id}")
    public Viaggio updateTravel(@PathVariable Long id, @RequestBody Viaggio dettagliViaggio) {
        return travelService.updateTravel(id, dettagliViaggio);
    }

    @DeleteMapping("/{id}")
    public void deleteTravel(@PathVariable Long id) {
        travelService.deleteTravel(id);
    }
}
