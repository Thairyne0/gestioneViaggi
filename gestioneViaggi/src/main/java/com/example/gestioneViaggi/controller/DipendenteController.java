package com.example.gestioneViaggi.controller;

import com.example.gestioneViaggi.entity.Dipendente;
import com.example.gestioneViaggi.service.DipendenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dipendenti")
public class DipendenteController {
    @Autowired
    private DipendenteService employeeService;

    @GetMapping
    public List<Dipendente> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Dipendente getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Dipendente createEmployee(@RequestBody Dipendente dipendente) {
        return employeeService.createEmployee(dipendente);
    }

    @PutMapping("/{id}")
    public Dipendente updateEmployee(@PathVariable Long id, @RequestBody Dipendente dettagliDipendente) {
        return employeeService.updateEmployee(id, dettagliDipendente);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}
