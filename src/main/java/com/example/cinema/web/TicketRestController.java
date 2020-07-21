//package com.example.cinema.web;
//
//
//import com.example.cinema.dao.TicketRepository;
//import com.example.cinema.entities.Ticket;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class TicketRestController {
//    @Autowired
//    private TicketRepository ticketRepository;
//    @GetMapping("/ticks")
//    public List<Ticket> tickets()
//    {
//        return ticketRepository.findAll();
//    }
//    @GetMapping("/tick/{id}")
//    public Ticket ticket(@PathVariable Long id)
//    {
//        return ticketRepository.findById(id).get();
//    }
//    @PostMapping("/tick")
//    public Ticket save(@RequestBody Ticket ticket)
//    {
//        return ticketRepository.save(ticket);
//    }
//    @DeleteMapping("/tick/{id}")
//    public void delete(@PathVariable Long id){
//        ticketRepository.deleteById(id);
//    }
//    @PutMapping("ticke/{id}")
//    public Ticket update (@RequestBody Ticket ticket ,@PathVariable Long id )
//    {
//        ticket.setId(id);
//        return ticketRepository.save(ticket);
//    }
//}
