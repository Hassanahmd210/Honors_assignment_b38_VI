package com.airline.airlinemanagement.controllers;

import com.airline.airlinemanagement.dto.Flight;
import com.airline.airlinemanagement.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{flightCode}")
    public Flight getFlightByCode(@PathVariable String flightCode) {
        return flightService.getFlightByCode(flightCode);
    }
}
