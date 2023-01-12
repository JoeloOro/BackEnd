
package com.example.demo2.Controller;

import com.example.demo2.Service.IEducacionService;
import com.example.demo2.model.Educacion;
import com.example.demo2.model.Experiencia;
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
public class EducacionControler {
    @Autowired
   private IEducacionService PersoServ;
    
    @GetMapping ("/educacion/ver/{id}")
    public Educacion buscarEducacion(@PathVariable Long id) {
        return PersoServ.buscarEducacion(id);
    }
    
    @PostMapping ("/educacion/crear")
    public void editarEducacion(@RequestBody Educacion pers){
        PersoServ.crearEducacion(pers);
    }
    
    
    
    @GetMapping ("educacion/ver")
    @ResponseBody
    public List<Educacion> verEducaciones () {
       return PersoServ.verEducaciones();   
    }
    
  
    
    @DeleteMapping ("/educacion/delete/{id}")
    public void borrarEducacion (@PathVariable("id") Long id) {
        PersoServ.borrarEducacion(id);
    }
}
