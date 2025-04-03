package com.example.itticadashboard.service;

import com.example.itticadashboard.model.Performance;
import com.example.itticadashboard.repository.PerformanceRepository;

import jakarta.transaction.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Service
public class SimulatoreService {

    @Autowired
    private PerformanceRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    private final Random rand = new Random();

    private double arrotonda(double valore) {
        return Math.round(valore * 100.0) / 100.0;
    }

    private double generaTemperatura() {
        return arrotonda(12 + (28 - 12) * rand.nextDouble());
    }

    private double generaOssigeno() {
        return arrotonda(5 + (10 - 5) * rand.nextDouble());
    }

    private double generaSalinita() {
        return arrotonda(0.5 + (3 - 0.5) * rand.nextDouble());
    }

    private double generaCrescitaPesci() {
        return arrotonda(1 + rand.nextDouble());
    }

    private double generaMortalita() {
        return arrotonda(1 + rand.nextDouble());
    }

    public void generaDatiPer7Giorni() {
        for (int i = 0; i < 7; i++) {
            Performance p = new Performance();
            p.setGiorno(LocalDate.now().minusDays(6 - i));
            p.setTemperatura(generaTemperatura());
            p.setOssigeno(generaOssigeno());
            p.setSalinita(generaSalinita());
            p.setCrescitaPesci(generaCrescitaPesci());
            p.setMortalita(generaMortalita());
            repository.save(p);
        }
    }

    public boolean nessunDatoNelDatabase() {
        return repository.count() == 0;
    }

    public List<Performance> getAll() {
        return repository.findAll();
    }

    @Transactional
    public void azzeraTuttiIDati() {
        repository.deleteAll();
        entityManager.createNativeQuery("ALTER TABLE performance AUTO_INCREMENT = 1").executeUpdate();
    }
}
