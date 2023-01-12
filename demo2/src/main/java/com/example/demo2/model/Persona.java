
package com.example.demo2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    String nombre;
    String posicion;
    String urlImagen;
    String acercaDe;
    String ubicacion;
    
    public Persona() {
    }

    public Persona(Long id, String email, String password, String nombre, String posicion, String urlImagen, String acercaDe, String ubicacion) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.posicion = posicion;
        this.urlImagen = urlImagen;
        this.acercaDe = acercaDe;
        this.ubicacion = ubicacion;
    }

    

    

    

    

   

   
    
    
    
    

    

    

    
    
    
    
    
}
