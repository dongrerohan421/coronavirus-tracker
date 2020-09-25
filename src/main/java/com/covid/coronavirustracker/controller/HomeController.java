package com.covid.coronavirustracker.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.covid.coronavirustracker.model.LocationStats;
import com.covid.coronavirustracker.service.CoronaVirusDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final String HOME = "home";

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalreportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("locationaStats", allStats);
        model.addAttribute("totaleportedCases", totalreportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return HOME;
    }

    @GetMapping("/displayPieChart")
    public String pieChart(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalreportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPrevDay()).sum();
        model.addAttribute("totaleportedCases", totalreportedCases);
        model.addAttribute("totalNewCases", totalNewCases);
        return "pieChart";
    }
}
