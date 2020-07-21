//package com.example.cinema.web;
//
//
//import com.example.cinema.dao.SeanceRepository;
//import com.example.cinema.entities.Seance;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class SeanceRestController {
//    @Autowired
//    private SeanceRepository seanceRepository;
//    @GetMapping("/seances")
//    public List<Seance> cinemas()
//    {
//        return seanceRepository.findAll();
//    }
//    @GetMapping("/seances/{id}")
//    public Seance seance(@PathVariable Long id)
//    {
//        return seanceRepository.findById(id).get();
//    }
//    @PostMapping("/seances")
//    public Seance save(@RequestBody Seance seance)
//    {
//        return seanceRepository.save(seance);
//    }
//    @DeleteMapping("/seances/{id}")
//    public void delete(@PathVariable Long id){
//        seanceRepository.deleteById(id);
//    }
//    @PutMapping("seances/{id}")
//    public Seance update (@RequestBody Seance seance ,@PathVariable Long id )
//    {
//        seance.setId(id);
//        return seanceRepository.save(seance);
//    }
//}
