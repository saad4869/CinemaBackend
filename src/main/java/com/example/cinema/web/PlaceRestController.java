//package com.example.cinema.web;
//
//import com.example.cinema.dao.PlaceRepository;
//import com.example.cinema.entities.Place;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class PlaceRestController {
//    @Autowired
//    private PlaceRepository placeRepository;
//    @GetMapping("/places")
//    public List<Place> places()
//    {
//        return placeRepository.findAll();
//    }
//    @GetMapping("/places/{id}")
//    public Place place(@PathVariable Long id)
//    {
//        return placeRepository.findById(id).get();
//    }
//    @PostMapping("/places")
//    public Place save(@RequestBody Place place)
//    {
//        return placeRepository.save(place);
//    }
//    @DeleteMapping("/places/{id}")
//    public void delete(@PathVariable Long id){
//        placeRepository.deleteById(id);
//    }
//    @PutMapping("places/{id}")
//    public Place update (@RequestBody Place place ,@PathVariable Long id )
//    {
//        place.setId(id);
//        return placeRepository.save(place);
//    }
//}
