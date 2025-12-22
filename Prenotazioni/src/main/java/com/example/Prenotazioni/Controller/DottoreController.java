package com.example.Prenotazioni.Controller;

import com.example.Prenotazioni.Model.Dottore;
import com.example.Prenotazioni.Service.DottoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dottori")
public class DottoreController {

    DottoreService service;

    public DottoreController(DottoreService service) {
        this.service = service;
    }

    @GetMapping("/getAllDottori")
    public List<Dottore> getAll(){
        return service.getAll();
    }

    @GetMapping("/getDottore/{id}")
    public Dottore Dottore(@PathVariable int id) {
        return service.getDottore(id);
    }

    @PostMapping("/createLibro")
    public Dottore createLbro(@RequestBody Dottore dottore) {
        return service.createDottore(dottore);
    }

    @PutMapping("/putLibro")
    public Dottore updateDottore(@RequestBody Dottore dottore) {
        return service.updateDottore(dottore);
    }

    @DeleteMapping("/deleteDottore/{id}")
    public void Delete(@PathVariable int id) {
        service.deleteDottore(id);
    }

    @GetMapping("/getSpecializzazione/{specializzazione}")
    public Dottore findDottoreBySpecializzazione(@PathVariable String specializzazione) {return service.findBySpecializzazione(specializzazione);}
}
