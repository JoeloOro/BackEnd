
package com.example.demo2.Controller;

import com.example.demo2.model.Persona;
import com.example.demo2.Service.IPersonaService;
import com.example.demo2.Service.PersonaDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = {"http://localhost:4200/"})
public class Controller {
  

  
   @Autowired
   private IPersonaService PersoServ;
   
   
    
    @GetMapping ("/ver/perfil")
    public Persona buscarPersona() {
        return PersoServ.buscarPersona((long)1);
    }
    
    @PostMapping ("/persona/crear")
    public void editarPersona(@RequestBody Persona pers){
        PersoServ.crearPersona(pers);
    }
    
    
    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas () {
       return PersoServ.verPersonas();   
    }
    
  
    
    @DeleteMapping ("/persona/delete/{id}")
    public void borrarPersona (@PathVariable Long id) {
        PersoServ.borrarPersona(id);
    }
    @PostMapping("/persona/login")
    @ResponseBody
    public PersonaDTO login(@RequestBody Persona persona){
        return PersoServ.login(persona.getEmail(), persona.getPassword());
    }
    
    

   
    
}
