
package com.todocodeacademy.pruebaJPA.service;

import com.todocodeacademy.pruebaJPA.model.Persona;
import com.todocodeacademy.pruebaJPA.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
  
    @Autowired
    private IPersonaRepository persoRepo;

    @Override
    public List<Persona> getPersona() {
       List<Persona>listaPersona = persoRepo.findAll();
       return listaPersona;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepo.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
       //busco el objeto original
       Persona perso = this.findPersona(idOriginal);
       
       //proceso de modificacion a nivel logico
       perso.setId(idNueva);
       perso.setNombre(nuevoNombre);
       perso.setApellido(nuevoApellido);
       perso.setEdad(nuevaEdad);
        
    }

    @Override
    public void editPersona(Persona per) {
        this.savePersona(per);
    }
}
