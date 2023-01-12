
package com.example.demo2.Service;

import com.example.demo2.model.Persona;
import java.util.List;
import java.util.Optional;


public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public Optional<Persona> getOne(Long id);
    public Optional<Persona> getByNombre(String nombre);
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    public boolean existeId(Long id);
    public boolean existeNombre(String nombre);


    public PersonaDTO login(String email, String password);
    
    
}
