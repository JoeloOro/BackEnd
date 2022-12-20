
package com.example.demo2.model;

import jakarta.persistence.Basic;
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
    @Basic
    private String email;
    private String password;
    String ubication;
    String position;
    String fullName;
    String image;

    public Persona() {
    }

    public Persona(Long id, String email, String password, String ubication, String position, String fullName, String image) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.ubication = ubication;
        this.position = position;
        this.fullName = fullName;
        this.image = image;
    }

    

    

    

    
    
    
    
    
}
