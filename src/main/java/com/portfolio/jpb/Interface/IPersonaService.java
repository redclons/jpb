
package com.portfolio.jpb.Interface;

import com.portfolio.jpb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //trae una lista de personas
    public List<Persona> getPersona();
    
    //guardar una Persona
    public void savePersona(Persona persona);
    
    //eliminar una persona por id
    public void deletePersona(Long id);

    //buscar una persona por id
    public Persona findPersona(Long id);
}
