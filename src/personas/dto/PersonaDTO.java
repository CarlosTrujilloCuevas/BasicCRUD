package personas.dto;

public class PersonaDTO {

    private int Id_persona;
    private String Nombre;
    private String Apellido;

    public PersonaDTO(int Id_persona, String Nombre, String Apellido) {
        this.Id_persona = Id_persona;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getId() {
        return Id_persona;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    @Override
    public String toString() {
        return "PersonaDTO{" + "Id_persona=" + Id_persona + ", Nombre=" + Nombre + ", Apellido=" + Apellido + '}';
    }

}
