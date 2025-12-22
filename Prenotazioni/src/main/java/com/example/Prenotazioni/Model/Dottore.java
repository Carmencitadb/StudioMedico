package com.example.Prenotazioni.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "dottori")
public class Dottore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nominativo;
    String specializzazione;

    public Dottore() {

    }

    public Dottore(int id, String nominativo, String specializzazione) {
        this.id = id;
        this.nominativo = nominativo;
        this.specializzazione = specializzazione;
    }

    public Dottore(String nominativo, String specializzazione) {
        this.nominativo = nominativo;
        this.specializzazione = specializzazione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

}
