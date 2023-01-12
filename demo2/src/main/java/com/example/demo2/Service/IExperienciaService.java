
package com.example.demo2.Service;


import com.example.demo2.model.Experiencia;
import java.util.List;
import java.util.Optional;

public interface IExperienciaService {
    public List<Experiencia> verExperiencias ();
    public Optional<Experiencia> getOne(Long id);
    public Optional<Experiencia> getByNombre(String nombre);
    public void crearExperiencia (Experiencia per);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
    public boolean existeId(Long id);
    public boolean existeNombre(String nombre);
}
