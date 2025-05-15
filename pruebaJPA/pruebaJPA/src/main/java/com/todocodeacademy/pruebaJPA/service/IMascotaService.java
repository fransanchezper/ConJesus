
package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Mascota;
import java.util.List;


public interface IMascotaService {
    //metodo para traer todas las mascotas
    //lectura
     public List<Mascota> getMascota();
    
    //alta
    public void saveMascota(Mascota masco);
    
    //baja
    public void deleteMascota(Long id_mascota); 
    
    //lectuta de un solo objeto
    public Mascota findMascota(Long id_mascota);
    //modificar
    public void editMascota(Long idOriginal,
                            Long id_mascotaNueva,
                            String nuevoNombre,
                            String nuevoEspecie,
                            String nuevaRaza,
                            String nuevoColor);
}

