/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import entidades.ClienteEntidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class ClienteDAO implements IClienteDAO {

    @Override
    public ClienteEntidad registrar(ClienteEntidad cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    private void insentarCliente(ClienteEntidad cliente, Connection conexion) throws SQLException{
       String insertCliente = "INSERT INTO clientes (nombre, nomUsuario, contraseña, apellidoPa, apellidoMa) VALUES (?, ?)";
        try ( PreparedStatement preparedStatement = conexion.prepareStatement(insertCliente, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, cliente.getNomUsuario());
            preparedStatement.setString(2, cliente.getContraseña());
            // Ejecutar la actualización
            preparedStatement.executeUpdate();
            // Obtener las claves generadas
            ResultSet resultado = preparedStatement.getGeneratedKeys();
            while (resultado.next()) {
                cliente.setIdCliente(resultado.getInt(1));
            }
        }
    }
    @Override
    public ClienteEntidad editar(ClienteEntidad cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
