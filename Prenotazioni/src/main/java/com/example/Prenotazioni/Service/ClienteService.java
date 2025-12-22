package com.example.Prenotazioni.Service;

import com.example.Prenotazioni.Model.Cliente;
import com.example.Prenotazioni.Repository.ClienteRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    ClienteRepo repo;

    public ClienteService(ClienteRepo repo) {
        this.repo = repo;
    }

    //metodi CRUD
    public List<Cliente> getAll() {
        return repo.findAll();
    }

    public Cliente getCliente(int id) {
        return repo.getReferenceById(id);
    }

    public Cliente createCliente(Cliente cliente){
        return repo.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente){
        return repo.save(cliente);
    }

    public void deleteCliente(int id){
        repo.deleteById(id);
    }

    public Cliente findClienteByNomeAndCognome(String nome, String cognome){
      return  repo.findClienteByNomeAndCognome(nome, cognome);
    }
}
