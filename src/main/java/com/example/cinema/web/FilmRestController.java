//package com.example.cinema.web;
//
//import com.example.cinema.dao.FilmRepository;
//import com.example.cinema.entities.Film;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class FilmRestController {
//    @Autowired
//    private FilmRepository filmRepository;
//
//
//}
////    @GetMapping("/films")
////    public List<Film> films()
////    {
////        return filmRepository.findAll();
////    }
////    @GetMapping("/films/{id}")
////    public Film film(@PathVariable Long id)
////    {
////        return filmRepository.findById(id).get();
////    }
////    @PostMapping("/films")
////    public Film save(@RequestBody Film cinema)
////    {
////        return filmRepository.save(cinema);
////    }
////    @DeleteMapping("/films/{id}")
////    public void delete(@PathVariable Long id){
////        filmRepository.deleteById(id);
////    }
////    @PutMapping("films/{id}")
////    public Film update (@RequestBody Film film ,@PathVariable Long id )
////    {
////        film.setId(id);
////        return filmRepository.save(film);
////    }
