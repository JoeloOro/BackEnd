
package com.example.demo2.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String email;
    private String password;
    String nombre;
    String posicion;
    String urlImagen;
    String acercaDe;
    String ubicacion;
    @OneToMany(mappedBy = "persona")
    List<Experiencia> experiencia;
    @OneToMany(mappedBy = "persona")
    List<Educacion> educacion;
    @OneToMany(mappedBy = "persona")
    List<Skill> skill;
    @OneToMany(mappedBy = "persona")
    List<Proyectos> proyectos;
    
    public Persona() {
    }

    public Persona(Long id, String email, String password, String nombre, String posicion, String urlImagen, String acercaDe, String ubicacion, List<Experiencia> experiencia, List<Educacion> educacion, List<Skill> skill, List<Proyectos> proyectos) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.posicion = posicion;
        this.urlImagen = urlImagen;
        this.acercaDe = acercaDe;
        this.ubicacion = ubicacion;
        this.experiencia = experiencia;
        this.educacion = educacion;
        this.skill = skill;
        this.proyectos = proyectos;
    }

    

   

   
    
    
    
    

    

    

    
    
    
    
    
}
