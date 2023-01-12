
package com.example.demo2.Repository;

import com.example.demo2.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository <Experiencia, Long>{
    public boolean existsByNombre(String nombre);

    public Optional<Experiencia> findById(int id);

    public Optional<Experiencia> findBynombre(String nombre);
    
}
