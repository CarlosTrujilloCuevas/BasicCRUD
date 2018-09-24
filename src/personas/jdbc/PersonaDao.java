package personas.jdbc;

import java.util.List;
import personas.dto.PersonaDTO;

public interface PersonaDao {

    public int insert(PersonaDTO persona);

    public int update(PersonaDTO persona);

    public int delete(PersonaDTO persona);

    public List<PersonaDTO> select();

}
