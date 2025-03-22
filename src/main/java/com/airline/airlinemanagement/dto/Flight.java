package com.airline.airlinemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Duration;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    private String flightCode;
    private String airlineName;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;
    private List<String> flightDates;
    private int seatCapacity;
    private Duration duration;
    private double ticketPrice;
    private boolean international;
}
