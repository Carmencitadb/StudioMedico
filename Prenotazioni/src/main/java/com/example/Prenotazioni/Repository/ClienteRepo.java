package com.example.Prenotazioni.Repository;

import com.example.Prenotazioni.Model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente,Integer> {
    Cliente findClienteByNomeAndCognome(String nome, String cognome);
}
