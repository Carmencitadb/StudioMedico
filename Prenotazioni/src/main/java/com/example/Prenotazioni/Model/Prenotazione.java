package com.example.Prenotazioni.Model;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String visita;
    Date data;
    int idDottore;
    int idCliente;

    public Prenotazione() {

    }

    public Prenotazione(int idDottore, String visita, int idCliente, Date data) {
        this.idDottore = idDottore;
        this.visita = visita;
        this.idCliente = idCliente;
        this.data = data;
    }

    public Prenotazione(int id, String visita, Date data, int idDottore, int idCliente) {
        this.id = id;
        this.visita = visita;
        this.data = data;
        this.idDottore = idDottore;
        this.idCliente=idCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisita() {
        return visita;
    }

    public void setVisita(String visita) {
        this.visita = visita;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdDottore() {
        return idDottore;
    }

    public void setIdDottore(int idDottore) {
        this.idDottore = idDottore;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
