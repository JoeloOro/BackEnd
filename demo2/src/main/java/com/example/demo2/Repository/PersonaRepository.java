
package com.example.demo2.Repository;

import com.example.demo2.model.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    public Persona findByEmailAndPassword(String email, String password);
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    public Optional<Persona> findById(int id);
    public Optional<Persona> findBynombre(String nombre);

}
