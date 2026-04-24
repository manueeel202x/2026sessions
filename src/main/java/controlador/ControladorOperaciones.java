/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Operacion;
import vista.frmOperaciones;

/**
 *
 * @author F20LAB207E02
 */
public class ControladorOperaciones {
    private Operacion modelo;
    private frmOperaciones vista;
    
    public ControladorOperaciones(Operacion modelo, frmOperaciones vista){
        this.modelo = modelo;
        this.vista = vista;
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
