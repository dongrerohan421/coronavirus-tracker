package com.covid.coronavirustracker.controller;

import java.util.List;

import com.covid.coronavirustracker.model.LocationStats;
import com.covid.coronavirustracker.service.CoronaVirusDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("locationStats")
public class LocationStatsController {
    private final CoronaVirusDataService coronaVirusDataService;

    @Autowired
    public LocationStatsController(CoronaVirusDataService coronaVirusDataService) {
        this.coronaVirusDataService = coronaVirusDataService;
    }

    @GetMapping
    public List<LocationStats> list() {
        return coronaVirusDataService.getAllStats();
    }

}
