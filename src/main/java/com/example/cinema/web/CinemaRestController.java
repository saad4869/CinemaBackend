package com.example.cinema.web;

import com.example.cinema.dao.CategorieRepository;
import com.example.cinema.dao.CinemaRepository;
import com.example.cinema.dao.FilmRepository;
import com.example.cinema.dao.TicketRepository;
import com.example.cinema.entities.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
@RestController
@CrossOrigin("*")
public class CinemaRestController {
    @Autowired
    private CinemaRepository cinemaRepository;
    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private TicketRepository ticketRepository;
    @Autowired
    private CategorieRepository categorieRepository;

    @GetMapping(path = "/imageFilm/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] image(@PathVariable(name = "id") Long id) throws IOException {
        Film f = filmRepository.findById(id).get();
        String photoname = f.getPhoto();
        File file = new File(System.getProperty("user.home") + "/cinema/images/" + photoname);
        Path path = Paths.get(file.toURI());
        return Files.readAllBytes(path);
    }

    @PostMapping(path = "/payerTickets")
    public List<Ticket> payerTickets(@RequestBody TicketForm ticketForm) {
        List<Ticket> listTickets = new ArrayList<>();
        ticketForm.getTickets().forEach(idTicket ->
        {
            Ticket ticket = ticketRepository.findById(idTicket).get();
            ticket.setNomClient(ticketForm.getNomClient());
            ticket.setCodePayement(ticketForm.getCodePayement());
            ticket.setReservationState(true);
            ticketRepository.save(ticket);
            listTickets.add(ticket);
        });
        return listTickets;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping(path = "/AjouterFilm/{id}")
    public Film AjouterFilm(@PathVariable(value = "id") Long id, @RequestBody Film film) {
        return categorieRepository.findById(id).map(em -> {
            film.setCategorie(em);
            return filmRepository.save(film);
        }).orElseThrow(() -> new ResourceNotFoundException("Categorie " + id + " not found"));
    }
}
@Data
class TicketForm{
    private String nomClient;
    private int codePayement;
    private List<Long> tickets = new ArrayList<>();
}
@Data
class FilmForm{
    private String titre;
    private double duration;
    private String realisateur;
    private Date dateSortie;
    private String description;
    private String photo;
    private List<Long> projections;
    private Categorie categorie;
}
//    @GetMapping("/cines")
//    public List<Cinema> cinemas()
//    {
//        return cinemaRepository.findAll();
//    }
//    @GetMapping("/cines/{id}")
//    public Cinema cinema(@PathVariable Long id)
//    {
//        return cinemaRepository.findById(id).get();
//    }
//    @PostMapping("/cines")
//    public Cinema save(@RequestBody Cinema cinema)
//    {
//        return cinemaRepository.save(cinema);
//    }
//    @DeleteMapping("/cines/{id}")
//    public void delete(@PathVariable Long id){
//        cinemaRepository.deleteById(id);
//    }
//    @PutMapping("cines/{id}")
//    public Cinema update (@RequestBody Cinema cinema ,@PathVariable Long id )
//    {
//        cinema.setId(id);
//        return cinemaRepository.save(cinema);
//    }
