
package com.example.demo2.Service;

import com.example.demo2.Repository.ProyectosRepository;
import com.example.demo2.model.Proyectos;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectoService implements IProyectoService{

    @Autowired
    public ProyectosRepository persoRepo;
    
    @Override
    public List<Proyectos> verProyectos() {
        return persoRepo.findAll(); 
    }
    
    @Override
    public Optional<Proyectos> getOne(Long id) {
        return persoRepo.findById(id);
    }
    @Override
    public Optional<Proyectos> getByNombre(String nombre) {
        return persoRepo.findBynombre(nombre);
    }

    @Override
    public void crearProyecto(Proyectos per) {
        persoRepo.save(per);
    }

    @Override
    public Proyectos buscarProyecto(Long id) {
        return persoRepo.findById(id).orElse(null);
    }
   
    @Override
    public boolean existeNombre(String nombre) {
        return persoRepo.existsByNombre(nombre);
    }

    @Override
    public void borrarProyectos(Long id) {
        persoRepo.deleteById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean existeId(Long id) {
        return persoRepo.existsById(id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
