
package com.example.demo2.Service;

import com.example.demo2.Repository.SkillRepository;
import com.example.demo2.model.Skill;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SkillService implements ISkillService{
    
    @Autowired
    public SkillRepository persoRepo;
    
    @Override
    public List<Skill> verSkills() {
        return persoRepo.findAll(); 
    }
    
    @Override
    public Optional<Skill> getOne(Long id) {
        return persoRepo.findById(id);
    }
    @Override
    public Optional<Skill> getByNombre(String nombre) {
        return persoRepo.findBynombre(nombre);
    }

    @Override
    public void crearSkill (Skill per) {
        persoRepo.save(per); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarSkill(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Skill buscarSkill(Long id) {
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
    
}

