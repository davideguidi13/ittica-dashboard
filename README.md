# Dashboard Interattiva per il Monitoraggio delle Prestazioni in Ambito Ittico

## 📌 Descrizione del Progetto

Questo progetto è stato realizzato come parte del Project Work per il conseguimento della **Laurea Triennale** in ambito informatico. L’obiettivo dell’elaborato è sviluppare un sistema software per il **monitoraggio delle prestazioni ambientali e produttive** di un’azienda operante nel settore primario, con particolare riferimento all’ambito dell’acquacoltura.

## 🎯 Obiettivi Formativi

- Sviluppare competenze nell’**integrazione e visualizzazione di dati ambientali** tramite interfacce utente interattive.
- Utilizzare tecnologie moderne come **Spring Boot**, **Thymeleaf** e **Java** per lo sviluppo full-stack.
- Applicare concetti di **user experience (UX)** e **data visualization** per facilitare l’interpretazione dei dati da parte degli utenti finali.

## 🧱 Tecnologie Utilizzate

- **Java 17**
- **Spring Boot 3.4.4**
- **Spring Data JPA**
- **Thymeleaf**
- **MySQL**
- **HTML, CSS**

## ⚙️ Funzionalità

- Simulazione automatica di dati ambientali: temperatura, ossigeno, salinità, crescita dei pesci e mortalità.
- Salvataggio dei dati su database relazionale MySQL.
- Dashboard interattiva accessibile via web.
- Pulsanti per:
  - **Generare nuovi dati** simulati
  - **Azzerare** i dati e resettare l’`ID`
  - **Esportare** i dati in formato `.docx`

## 📂 Struttura del Progetto

ittica-dashboard/ ├── controller/ ├── model/ ├── repository/ ├── service/ ├── templates/ # File HTML Thymeleaf ├── static/ # File CSS └── application.properties

## ▶️ Come Avviare il Progetto

1. Creare il database `azienda_ittica` su MySQL:
   ```sql
   CREATE DATABASE azienda_ittica;
