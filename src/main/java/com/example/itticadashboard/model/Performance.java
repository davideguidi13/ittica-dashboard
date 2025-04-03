package com.example.itticadashboard.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate giorno;
    private double temperatura;
    private double ossigeno;
    private double salinita;
    private double crescitaPesci;
    private double mortalita;

    // Getter e Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getGiorno() {
        return giorno;
    }

    public void setGiorno(LocalDate giorno) {
        this.giorno = giorno;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getOssigeno() {
        return ossigeno;
    }

    public void setOssigeno(double ossigeno) {
        this.ossigeno = ossigeno;
    }

    public double getSalinita() {
        return salinita;
    }

    public void setSalinita(double salinita) {
        this.salinita = salinita;
    }

    public double getCrescitaPesci() {
        return crescitaPesci;
    }

    public void setCrescitaPesci(double crescitaPesci) {
        this.crescitaPesci = crescitaPesci;
    }

    public double getMortalita() {
        return mortalita;
    }

    public void setMortalita(double mortalita) {
        this.mortalita = mortalita;
    }
}
