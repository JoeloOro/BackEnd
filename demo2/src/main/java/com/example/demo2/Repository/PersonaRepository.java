
package com.example.demo2.Repository;

import com.example.demo2.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    public Persona findByEmailAndPassword(String email, String password);
}
