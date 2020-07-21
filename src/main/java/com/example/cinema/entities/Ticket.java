package com.example.cinema.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.criterion.ProjectionList;

import javax.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nomClient;
    private double prix;
    @Column(unique=false,nullable = true)
    private Integer codePayement;
    private boolean reservationState;
    @ManyToOne
    private Place place;
    @ManyToOne
    private Projection projection;

}
