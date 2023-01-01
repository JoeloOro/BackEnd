
package com.example.demo2.Service;

import com.example.demo2.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List<Persona> verPersonas ();
    public void crearPersona (Persona per);
    public void borrarPersona (Long id);
    public Persona buscarPersona (Long id);
    public PersonaDTO Persona (Long id);


    public PersonaDTO login(String email, String password);
    
    
}
