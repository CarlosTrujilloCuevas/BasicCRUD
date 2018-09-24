package personas.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import personas.dto.PersonaDTO;

public class PersonaDaoJDBC implements PersonaDao {

    private Connection conexion;
    private static final String insert = "INSERT INTO `persona` VALUES (Id_persona, ?, ?)";
    private static final String update = "UPDATE `persona` SET Nombre = ?, Apellido = ? WHERE Id_persona = ?";
    private static final String delete = "DELETE FROM `persona` WHERE Id_persona = ?";
    private static final String select = "SELECT * FROM `persona`";

    @Override
    public int insert(PersonaDTO persona) {
        Connection connect;
        PreparedStatement preparedStatement;
        int AfectedRows = 0;
        int index = 1;
        try {
            connect = (conexion != null) ? this.conexion : Conexion.getConnection();
            preparedStatement = connect.prepareStatement(insert);
            preparedStatement.setString(index++, persona.getNombre());
            preparedStatement.setString(index, persona.getApellido());
            AfectedRows = preparedStatement.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Error ," + ex);
        }
        return AfectedRows;
    }

    @Override
    public int update(PersonaDTO persona) {
        Connection connect;
        PreparedStatement preparedStatement;
        int AfectedRows = 0;
        int index = 1;
        try {
            connect = (conexion != null) ? this.conexion : Conexion.getConnection();
            preparedStatement = connect.prepareStatement(update);
            preparedStatement.setString(index++, persona.getNombre());
            preparedStatement.setString(index++, persona.getApellido());
            preparedStatement.setInt(index, persona.getId());
            AfectedRows = preparedStatement.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Error , " + ex);
        }
        return AfectedRows;
    }

    @Override
    public int delete(PersonaDTO persona) {
        Connection connect;
        PreparedStatement preparedStatement;
        int AfectedRows = 0;
        try {
            connect = (conexion != null) ? this.conexion : Conexion.getConnection();
            preparedStatement = connect.prepareStatement(delete);
            preparedStatement.setInt(1, persona.getId());
            AfectedRows = preparedStatement.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        return AfectedRows;
    }

    @Override
    public List<PersonaDTO> select() {
        Connection connect;
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        List<PersonaDTO> personas = new ArrayList<>();
        try {
            connect = (conexion != null) ? this.conexion : Conexion.getConnection();
            preparedStatement = connect.prepareStatement(select);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                personas.add(new PersonaDTO(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3)));
            }
        } catch (Exception ex) {
            System.err.println("Error, " + ex);
        }
        return personas;
    }
}
