
package com.example.demo2.Service;

import com.example.demo2.model.Skill;
import java.util.List;
import java.util.Optional;

public interface ISkillService {
    public List<Skill> verSkills ();
    public Optional<Skill> getOne(Long id);
    public Optional<Skill> getByNombre(String nombre);
    public void crearSkill (Skill per);
    public void borrarSkill (Long id);
    public Skill buscarSkill (Long id);
    public boolean existeId(Long id);
    public boolean existeNombre(String nombre);
}
