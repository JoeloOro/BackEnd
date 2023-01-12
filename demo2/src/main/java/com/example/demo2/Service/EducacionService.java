
package com.example.demo2.Service;

import com.example.demo2.Repository.EducacionRepository;
import com.example.demo2.model.Educacion;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService implements IEducacionService{
    @Autowired
    public EducacionRepository persoRepo;
    
    @Override
    public List<Educacion> verEducaciones() {
        return persoRepo.findAll(); 
    }
    
    @Override
    public Optional<Educacion> getOne(Long id) {
        return persoRepo.findById(id);
    }
    
    @Override
    public Optional<Educacion> getByNombre(String nombre) {
        return persoRepo.findBynombre(nombre);
    }

    @Override
    public void crearEducacion(Educacion per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarEducacion(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
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