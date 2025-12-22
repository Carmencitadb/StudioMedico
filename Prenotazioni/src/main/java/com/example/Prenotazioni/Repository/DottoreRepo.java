package com.example.Prenotazioni.Repository;

import com.example.Prenotazioni.Model.Dottore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DottoreRepo extends JpaRepository <Dottore,Integer> {

    Dottore findDottoreBySpecializzazione(String specializzazione);
}
