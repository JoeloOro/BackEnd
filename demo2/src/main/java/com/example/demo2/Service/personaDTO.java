
package com.example.demo2.Service;


public class PersonaDTO {
    long id;
    String nombre;
    String urlImagen;
    String acercaDe;
    String ubicacion;

    public PersonaDTO() {
    }

    public PersonaDTO(long id, String nombre, String urlImagen, String acercaDe, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.urlImagen = urlImagen;
        this.acercaDe = acercaDe;
        this.ubicacion = ubicacion;
    }
    
    
    
   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public String getAcercaDe() {
        return acercaDe;
    }

    public void setAcercaDe(String acercaDe) {
        this.acercaDe = acercaDe;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    

    

    
}
