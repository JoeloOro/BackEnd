
package com.example.demo2.Repository;



import com.example.demo2.model.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Long>{
     public boolean existsByNombre(String nombre);

    public Optional<Proyectos> findById(int id);

    public Optional<Proyectos> findBynombre(String nombre);



}
    