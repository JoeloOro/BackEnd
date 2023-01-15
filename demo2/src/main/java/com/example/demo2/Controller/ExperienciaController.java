
package com.example.demo2.Controller;

import com.example.demo2.Service.IExperienciaService;
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
@CrossOrigin(origins = {"https://frontendjoel.web.app/"})
public class ExperienciaController {
    
    @Autowired
   private IExperienciaService PersoServ;
    
    @GetMapping ("/experiencia/ver/{id}")
    public Experiencia buscarExperiencia(@PathVariable Long id) {
        return PersoServ.buscarExperiencia(id);
    }
    
    @PostMapping ("/experiencia/crear")
    public void editarExperiencia(@RequestBody Experiencia pers){
        PersoServ.crearExperiencia(pers);
    }
    
    
    
    @GetMapping ("experiencia/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias () {
       return PersoServ.verExperiencias();   
    }
    
  
    
    @DeleteMapping ("/experiencia/delete/{id}")
    public void borrarExperiencia (@PathVariable("id") Long id) {
        PersoServ.borrarExperiencia(id);
    }
    
}
