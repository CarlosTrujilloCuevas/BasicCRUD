package personas.test;

import java.util.ArrayList;
import java.util.List;
import personas.dto.PersonaDTO;
import personas.jdbc.Conexion;
import personas.jdbc.PersonaDaoJDBC;

public class TestPersona {

    public static void main(String[] args) {

        PersonaDaoJDBC manager = new PersonaDaoJDBC();

        List<PersonaDTO> listaDB = new ArrayList<>();

        listaDB = manager.select();

        for (PersonaDTO index : listaDB) {
            System.out.println(index.toString());
        }
        /*PersonaDTO newIncome = new PersonaDTO(0, "Juan", "Alarcon");
        manager.insert(newIncome);*/

 /*PersonaDTO replace = new PersonaDTO(10, "JuanPablo", "Ortega");
        manager.update(replace);*/
//        PersonaDTO delete = new PersonaDTO(11, "Juan", "Alarcon");
//        manager.delete(delete);
    }
}
