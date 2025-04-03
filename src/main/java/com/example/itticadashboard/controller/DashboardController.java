package com.example.itticadashboard.controller;

import com.example.itticadashboard.model.Performance;
import com.example.itticadashboard.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private PerformanceRepository performanceRepository;

    @GetMapping("/dashboard")
    public String getDashboard(Model model) {
        List<Performance> performances = performanceRepository.findAll();
        model.addAttribute("performances", performances);
        return "dashboard"; // Questo cercherà il file dashboard.html in src/main/resources/templates
    }
}
