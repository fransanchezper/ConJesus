
package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Persona;
import java.util.List;


public interface IPersonaService {
    //metodo para traer a todas las personas
    public List<Persona> getPersona();
    
    //alta
    public void savePersona(Persona perso);
    
    //baja
    public void deletePersona(Long id); 
    
    //lectuta de un solo objeto
    public Persona findPersona(Long id);
    //modificar
    public void editPersona(Long idOriginal,
                            Long idNueva,
                            String nuevoNombre,
                            String nuevoApellido,
                            int nuevaEdad);

    public void editPersona(Persona per);
}
