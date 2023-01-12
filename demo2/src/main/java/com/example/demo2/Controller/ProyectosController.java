
package com.example.demo2.Controller;

import com.example.demo2.Service.IProyectoService;
import com.example.demo2.model.Proyectos;
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
public class ProyectosController {
    @Autowired
   private IProyectoService PersoServ;
    
    @GetMapping ("/proyecto/ver/{id}")
    public Proyectos buscarProyecto(@PathVariable Long id) {
        return PersoServ.buscarProyecto(id);
    
    }
    @PostMapping ("/proyecto/crear")
    public void editarProyecto(@RequestBody Proyectos pers){
        PersoServ.crearProyecto(pers);
    }
    
    
    
    @GetMapping ("proyecto/ver")
    @ResponseBody
    public List<Proyectos> verProyectos () {
       return PersoServ.verProyectos();   
    }
    
  
    
    @DeleteMapping ("/proyecto/delete/{id}")
    public void borrarProyecto (@PathVariable("id") Long id) {
        PersoServ.borrarProyectos(id);
    }
    
}
