//package com.example.cinema.web;
//
//import com.example.cinema.dao.ProjectionRepository;
//import com.example.cinema.entities.Cinema;
//import com.example.cinema.entities.Projection;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ProjectionRestController {
//    @Autowired
//    private ProjectionRepository projectionRepository;
//    @GetMapping("/projections")
//    public List<Projection> projections()
//    {
//        return projectionRepository.findAll();
//    }
//    @GetMapping("/projections/{id}")
//    public Projection projection(@PathVariable Long id)
//    {
//        return projectionRepository.findById(id).get();
//    }
//    @PostMapping("/projections")
//    public Projection save(@RequestBody Projection projection)
//    {
//        return projectionRepository.save(projection);
//    }
//    @DeleteMapping("/projections/{id}")
//    public void delete(@PathVariable Long id){
//        projectionRepository.deleteById(id);
//    }
//    @PutMapping("projections/{id}")
//    public Projection update (@RequestBody Projection projection ,@PathVariable Long id )
//    {
//        projection.setId(id);
//        return projectionRepository.save(projection);
//    }
//}
