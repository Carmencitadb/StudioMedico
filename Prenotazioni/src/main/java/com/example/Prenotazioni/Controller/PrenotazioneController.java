package com.example.Prenotazioni.Controller;

import com.example.Prenotazioni.Model.Dottore;
import com.example.Prenotazioni.Model.Prenotazione;
import com.example.Prenotazioni.Service.PrenotazioneService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

    PrenotazioneService service;

    public PrenotazioneController(PrenotazioneService service) {
        this.service = service;
    }

    @GetMapping("/getAllPrenotazioni")
    public List<Prenotazione> getAll(){
        return service.getAll();
    }

    @GetMapping("/getPrenotazione")
    public Prenotazione getPrenotazione(@PathVariable int id) {
        return service.getPrenotazione(id);
    }

    @PostMapping("/createPrenotazione")
    public Prenotazione createPrenotazione(@RequestBody Prenotazione prenotazione) {
        return service.createPrenotazione(prenotazione);
    }

    @PutMapping("/putLibro")
    public Prenotazione updatePrenotazione(@RequestBody Prenotazione prenotazione) {
        return service.updatePrenotazione(prenotazione);
    }

    @DeleteMapping("/deletePrenotazione")
    public void Delete(@PathVariable int id) {
        service.deletePrenotazione(id);
    }
}
