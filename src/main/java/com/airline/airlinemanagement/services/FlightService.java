package com.airline.airlinemanagement.services;

import com.airline.airlinemanagement.dto.Flight;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Service
public class FlightService {

    private final List<Flight> flightInventory = new ArrayList<>();

    public FlightService() {
        flightInventory.add(new Flight("AI101", "Air India", "New Delhi", "Mumbai", "07:00 AM", "09:00 AM", List.of("2025-04-01", "2025-04-02"), 180, Duration.ofHours(2), 5000.0, false));
        flightInventory.add(new Flight("EK302", "Emirates", "Dubai", "London", "08:00 PM", "06:00 AM", List.of("2025-04-05", "2025-04-06"), 350, Duration.ofHours(8), 30000.0, true));
        flightInventory.add(new Flight("BA789", "British Airways", "London", "New York", "02:00 PM", "06:00 PM", List.of("2025-04-10", "2025-04-11"), 280, Duration.ofHours(7), 45000.0, true));
    }

    public List<Flight> getAllFlights() {
        return flightInventory;
    }

    public Flight getFlightByCode(String flightCode) {
        return flightInventory.stream()
                .filter(flight -> flight.getFlightCode().equalsIgnoreCase(flightCode))
                .findFirst()
                .orElse(null);
    }
}
