//package com.example.cinema.web;
//
//
//import com.example.cinema.dao.SalleRepository;
//import com.example.cinema.entities.Salle;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class SalleRestController {
//    @Autowired
//    private SalleRepository salleRepository;
//    @GetMapping("/salles")
//    public List<Salle> cinemas()
//    {
//        return salleRepository.findAll();
//    }
//    @GetMapping("/salles/{id}")
//    public Salle salle(@PathVariable Long id)
//    {
//        return salleRepository.findById(id).get();
//    }
//    @PostMapping("/salles")
//    public Salle save(@RequestBody Salle salle)
//    {
//        return salleRepository.save(salle);
//    }
//    @DeleteMapping("/salles/{id}")
//    public void delete(@PathVariable Long id){
//        salleRepository.deleteById(id);
//    }
//    @PutMapping("salles/{id}")
//    public Salle update (@RequestBody Salle salle ,@PathVariable Long id )
//    {
//        salle.setId(id);
//        return salleRepository.save(salle);
//    }
//}
