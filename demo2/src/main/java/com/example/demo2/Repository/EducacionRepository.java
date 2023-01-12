
package com.example.demo2.Repository;

import com.example.demo2.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    public boolean existsByNombre(String nombre);
    public Optional<Educacion> findById(int id);
    public Optional<Educacion> findBynombre(String nombre);
    
}
