package com.example.Prenotazioni.Controller;

import com.example.Prenotazioni.Model.Cliente;
import com.example.Prenotazioni.Service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/clienti")
public class ClienteController {

    ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("/getAllCliente")
    public List<Cliente> getAll(){
        return service.getAll();
    }

    @GetMapping("/getCliente")
    public Cliente getCliente(@PathVariable int id){
        return service.getCliente(id);
    }

    @PostMapping("/createCliente")
    public Cliente createCliente(@RequestBody Cliente cliente){
        return service.createCliente(cliente);
    }

    @PutMapping("/updateCliente")
    public Cliente updateCliente(@RequestBody Cliente cliente){
        return service.updateCliente(cliente);
    }

    @DeleteMapping("/deleteCliente")
    public void deleteCliente(@PathVariable int id){
        service.deleteCliente(id);
    }
}
