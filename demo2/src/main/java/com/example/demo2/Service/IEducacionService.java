
package com.example.demo2.Service;
import com.example.demo2.model.Educacion;
import java.util.List;
import java.util.Optional;

public interface IEducacionService {
    public Optional<Educacion> getOne(Long id);
    public Optional<Educacion> getByNombre(String nombre);
    public void crearEducacion (Educacion per);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);
    public boolean existeId(Long id);
    public boolean existeNombre(String nombre);
    public List<Educacion> verEducaciones();
}
