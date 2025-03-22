package com.airline.airlinemanagement.services;

import com.airline.airlinemanagement.dto.Ticket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    private final List<Ticket> ticketRecords = new ArrayList<>();

    public Ticket bookTicket(Ticket ticket) {
        ticketRecords.add(ticket);
        return ticket;
    }

    public Ticket getTicketById(String ticketId) {
        return ticketRecords.stream()
                .filter(ticket -> ticket.getTicketId().equalsIgnoreCase(ticketId))
                .findFirst()
                .orElse(null);
    }

    public boolean cancelTicket(String ticketId) {
        Ticket ticket = getTicketById(ticketId);
        if (ticket != null && !ticket.isCancelled()) {
            ticket.setCancelled(true);
            return true;
        }
        return false;
    }


}
