package com.example.itticadashboard.controller;

import com.example.itticadashboard.model.Performance;
import com.example.itticadashboard.service.SimulatoreService;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/simulatore")
public class SimulatoreController {

    @Autowired
    private SimulatoreService simulatoreService;

    @PostMapping("/genera")
    public String generaNuoviDati() {
        simulatoreService.generaDatiPer7Giorni();
        return "Nuovi dati generati con successo!";
    }
    @DeleteMapping("/azzera")
    public String azzeraDati() {
        simulatoreService.azzeraTuttiIDati();
        return "Dati eliminati con successo!";
    }

    @GetMapping("/esporta")
    public void esportaCsv(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; filename=dati_azienda_ittica.csv");

        List<Performance> performances = simulatoreService.getAll();

        PrintWriter writer = response.getWriter();
        writer.println("Giorno,Temperatura,Ossigeno,Salinità,CrescitaPesci,Mortalità");

        for (Performance p : performances) {
            writer.println(
                p.getGiorno() + "," +
                p.getTemperatura() + "," +
                p.getOssigeno() + "," +
                p.getSalinita() + "," +
                p.getCrescitaPesci() + "," +
                p.getMortalita()
            );
        }

        writer.flush();
        writer.close();
    }

}
