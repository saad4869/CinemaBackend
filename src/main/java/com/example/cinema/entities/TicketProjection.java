package com.example.cinema.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="ticketProj",types=Ticket.class)
public interface TicketProjection {
    public Long getId();
    public String getNomClient();
    public double getPrix();
    public Integer getcodePayement();
    public boolean getreservationState();
    public Place getPlace();
}
