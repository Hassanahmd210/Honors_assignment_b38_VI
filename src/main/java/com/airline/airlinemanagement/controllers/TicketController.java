package com.airline.airlinemanagement.controllers;

import com.airline.airlinemanagement.dto.Ticket;
import com.airline.airlinemanagement.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    @Autowired
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public Ticket bookTicket(@RequestBody Ticket ticket) {
        return ticketService.bookTicket(ticket);
    }




    @GetMapping("/{ticketId}")
    public Ticket getTicketById(@PathVariable String ticketId) {
        return ticketService.getTicketById(ticketId);
    }

    @DeleteMapping("/{ticketId}")
    public ResponseEntity<String> cancelTicket(@PathVariable String ticketId) {
        boolean cancelled = ticketService.cancelTicket(ticketId);
        if (cancelled) {
            return ResponseEntity.ok("Ticket cancelled successfully!");
        } else {
            return ResponseEntity.status(404).body("Ticket not found!");
        }
    }
}
