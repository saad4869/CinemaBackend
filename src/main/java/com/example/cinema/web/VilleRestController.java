//package com.example.cinema.web;
//
//
//import com.example.cinema.dao.VilleRepository;
//import com.example.cinema.entities.Ville;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class VilleRestController {
//    @Autowired
//    private VilleRepository villeRepository;
//    @GetMapping("/villes111")
//    public List<Ville> villes()
//    {
//        return villeRepository.findAll();
//    }
//    @GetMapping("/villes/{id}")
//    public Ville ville(@PathVariable Long id)
//    {
//        return villeRepository.findById(id).get();
//    }
//    @PostMapping("/villes")
//    public Ville save(@RequestBody Ville ville)
//    {
//        return villeRepository.save(ville);
//    }
//    @DeleteMapping("/villes/{id}")
//    public void delete(@PathVariable Long id){
//        villeRepository.deleteById(id);
//    }
//    @PutMapping("villes/{id}")
//    public Ville update (@RequestBody Ville ville ,@PathVariable Long id )
//    {
//        ville.setId(id);
//        return villeRepository.save(ville);
//    }
//}
