package com.example.Prenotazioni.Service;

import com.example.Prenotazioni.Model.Prenotazione;
import com.example.Prenotazioni.Repository.PrenotazioneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    PrenotazioneRepo repo;

    public PrenotazioneService(PrenotazioneRepo repo) {
        this.repo = repo;
    }

    //metodi crud
    public List<Prenotazione> getAll() {
        return repo.findAll();
    }

    public Prenotazione getPrenotazione(int id) {
        return repo.getReferenceById(id);
    }

    public Prenotazione createPrenotazione(Prenotazione prenotazione){
        return repo.save(prenotazione);
    }

    public Prenotazione updatePrenotazione(Prenotazione prenotazione){
        return repo.save(prenotazione);
    }
    public void deletePrenotazione(int id){
        repo.deleteById(id);
    }
}
