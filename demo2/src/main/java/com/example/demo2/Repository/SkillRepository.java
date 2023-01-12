
package com.example.demo2.Repository;

import com.example.demo2.model.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long>{
    public boolean existsByNombre(String nombre);

    public Optional<Skill> findById(int id);

    public Optional<Skill> findBynombre(String nombre);
    
}
