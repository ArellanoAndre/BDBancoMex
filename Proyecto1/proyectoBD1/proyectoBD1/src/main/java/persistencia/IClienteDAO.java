/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.ClienteEntidad;

/**
 *
 * @author Usuario
 */
public interface IClienteDAO {
  

    public ClienteEntidad registrar(ClienteEntidad cliente);

    public ClienteEntidad editar(ClienteEntidad cliente);

}