
package com.example.demo2.Service;

import com.example.demo2.Repository.PersonaRepository;
import com.example.demo2.model.Persona;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService implements IPersonaService{

    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll(); 
    }
    
    @Override
    public Optional<Persona> getOne(Long id) {
        return persoRepo.findById(id);
    }
    @Override
    public Optional<Persona> getByNombre(String nombre) {
        return persoRepo.findBynombre(nombre);
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
    
    @Override
    public boolean existeId(Long id) {
        return persoRepo.existsById(id);
    }
    
    @Override
    public boolean existeNombre(String nombre) {
        return persoRepo.existsByNombre(nombre);
    }
    
    @Override
    public PersonaDTO login(String email, String password) {
        Persona persona = persoRepo.findByEmailAndPassword(email, password);
        return new PersonaDTO(persona.getId(), persona.getNombre(), persona.getPosicion() , persona.getUrlImagen(), persona.getAcercaDe(), persona.getUbicacion());
        
    }

   

    
    
    
    
    
}
