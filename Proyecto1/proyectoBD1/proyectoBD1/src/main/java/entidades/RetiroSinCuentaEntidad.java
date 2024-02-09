/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class RetiroSinCuentaEntidad extends TransaccionEntidad {
   private String estado;
   private Date fechaCobro;
   private String contraseña;

    public RetiroSinCuentaEntidad(String estado, Date fechaCobro, String contraseña, int idTransaccion, BigDecimal monto, Date fechaRealizacion, String folio, int idCuentaOrigen) {
        super(idTransaccion, monto, fechaRealizacion, folio, idCuentaOrigen);
        this.estado = estado;
        this.fechaCobro = fechaCobro;
        this.contraseña = contraseña;
    }
   
   
}
