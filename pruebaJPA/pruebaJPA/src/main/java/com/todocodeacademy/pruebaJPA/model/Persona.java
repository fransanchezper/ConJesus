
package com.todocodeacademy.pruebaJPA.model;

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
    @OneToMany  //asin es relacion unidireccional si quisieramos bidireccional se pondria en la otra clase 
                //@ManyToOne y debajo en la otra clase Mascota private Persona perso
    private List<Mascota> listaMascotas;
    
   /* @OneToOne     este ejemplo es para una relacion 1 a 1 ny ademas de esto añadirlo al constructor
    @JoinColumn(name = "unamascota_id_mascota", referencedColumnName = "id_mascota")    //esto es para decirle a la base de datos                         
    private Mascota unamascota;                                                         //que este campo es el id de la otra clase 
    */
    public Persona() {
    }

    
    public Persona(Long id, String nombre, String apellido, int edad, List<Mascota> listaMascota  /*Mascota unMascota*/) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.listaMascotas = listaMascota;
      //  this.unamascota = unamascota;
    }
    
    
    
}
 