
package com.example.demo2.Service;

import com.example.demo2.Repository.ExperienciaRepository;
import com.example.demo2.model.Experiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository persoRepo;
    
    @Override
    public List<Experiencia> verExperiencias() {
        return persoRepo.findAll(); 
    }
    
    @Override
    public Optional<Experiencia> getOne(Long id) {
        return persoRepo.findById(id);
    }
    @Override
    public Optional<Experiencia> getByNombre(String nombre) {
        return persoRepo.findBynombre(nombre);
    }

    @Override
    public void crearExperiencia(Experiencia per) {
        persoRepo.save(per); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void borrarExperiencia(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
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
