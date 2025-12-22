package com.example.Prenotazioni.Repository;

import com.example.Prenotazioni.Model.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrenotazioneRepo extends JpaRepository<Prenotazione,Integer> {
}
