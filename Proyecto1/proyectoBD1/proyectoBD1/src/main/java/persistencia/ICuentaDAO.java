/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package persistencia;

import entidades.CuentaEntidad;

/**
 *
 * @author Usuario
 */
public interface ICuentaDAO {

    public CuentaEntidad registrar(CuentaEntidad cliente);

    public CuentaEntidad cancelarCuenta(CuentaEntidad cliente);

}
