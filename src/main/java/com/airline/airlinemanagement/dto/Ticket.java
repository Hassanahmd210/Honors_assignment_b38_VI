package com.airline.airlinemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private String ticketId;
    private String flightCode;
    private String passengerName;
    private String email;
    private boolean cancelled;
    private String seatNumber;
    private LocalDateTime bookingTime;
    private double totalFare;
    private String journeyDate;
    private boolean baggageIncluded;
}
