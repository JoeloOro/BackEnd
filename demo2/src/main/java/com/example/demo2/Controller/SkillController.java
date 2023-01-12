
package com.example.demo2.Controller;

import com.example.demo2.Service.ISkillService;
import com.example.demo2.model.Skill;
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
public class SkillController {
    @Autowired
   private ISkillService PersoServ;
    
    @GetMapping ("/skill/ver/{id}")
    public Skill buscarSkill(@PathVariable Long id) {
        return PersoServ.buscarSkill(id);
    }
    
    @PostMapping ("/skill/crear")
    public void editarSkill(@RequestBody Skill pers){
        PersoServ.crearSkill(pers);
    }
    
    
    
    @GetMapping ("skill/ver")
    @ResponseBody
    public List<Skill> verSkills () {
       return PersoServ.verSkills();   
    }
    
  
    
    @DeleteMapping ("/skill/delete/{id}")
    public void borrarSkill(@PathVariable("id") Long id) {
        PersoServ.borrarSkill(id);
    }
    
}

