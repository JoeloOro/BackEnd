
package com.example.demo2.Service;

import com.example.demo2.model.Proyectos;
import java.util.List;
import java.util.Optional;


public interface IProyectoService {
    public List<Proyectos> verProyectos ();
    public Optional<Proyectos> getOne(Long id);
    public Optional<Proyectos> getByNombre(String nombre);
    public void crearProyecto (Proyectos per);
    public void borrarProyectos (Long id);
    public Proyectos buscarProyecto (Long id);
    public boolean existeId(Long id);
    public boolean existeNombre(String nombre);
}
