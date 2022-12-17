
package com.example.demo2.Service;

import com.example.demo2.Repository.PersonaRepository;
import com.example.demo2.model.Persona;
//import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.String;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll(); 
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
    
    /*public Persona login(String email, String password) {
        return persoRepo.findByemailAndpassword(email, password);
    }*/
    
    
    
    
}
