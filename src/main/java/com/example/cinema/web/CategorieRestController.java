//package com.example.cinema.web;
//
//
//import com.example.cinema.dao.CategorieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.example.cinema.entities.Categorie;
//
//import java.util.List;
//
//@RestController
//public class CategorieRestController {
//    @Autowired
//    private CategorieRepository categorieRepository;
//    @GetMapping("/categorie")
//    public List<Categorie> cinemas()
//    {
//        return categorieRepository.findAll();
//    }
//    @GetMapping("/categorie/{id}")
//    public Categorie categorie(@PathVariable Long id)
//    {
//        return categorieRepository.findById(id).get();
//    }
//    @PostMapping("/categorie")
//    public Categorie save(@RequestBody Categorie categorie)
//    {
//        return categorieRepository.save(categorie);
//    }
//    @DeleteMapping("/categorie/{id}")
//    public void delete(@PathVariable Long id){
//        categorieRepository.deleteById(id);
//    }
//    @PutMapping("categorie/{id}")
//    public Categorie update (@RequestBody Categorie categorie ,@PathVariable Long id )
//    {
//        categorie.setId(id);
//        return categorieRepository.save(categorie);
//    }
//}
