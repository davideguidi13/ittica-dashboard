package com.example.itticadashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.itticadashboard.service.SimulatoreService;

@SpringBootApplication
public class ItticaDashboardApplication implements CommandLineRunner {

    @Autowired
    private SimulatoreService simulatoreService;

    public static void main(String[] args) {
        SpringApplication.run(ItticaDashboardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (simulatoreService.nessunDatoNelDatabase()) {
            simulatoreService.generaDatiPer7Giorni();
        }
    }

}
