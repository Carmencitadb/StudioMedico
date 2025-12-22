package com.example.Prenotazioni.Service;

import com.example.Prenotazioni.Model.Dottore;
import com.example.Prenotazioni.Repository.DottoreRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DottoreService {

    @Autowired
    DottoreRepo repo;

    public DottoreService(DottoreRepo repo) {
        this.repo = repo;
    }

    //metodi CRUD

    public List<Dottore> getAll() {
        return  repo.findAll();
    }

    public Dottore getDottore(int id) {
        return repo.getReferenceById(id);
    }

    public Dottore createDottore (Dottore dottore) {
        return repo.save(dottore);
    }

    public Dottore updateDottore(Dottore dottore){
        return repo.save(dottore);
    }

    public void deleteDottore(int id){
       repo.deleteById(id);
    }
}
