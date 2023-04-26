/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import view.Pedido;
import view.ResumenPedido;

/**
 *
 * @author Shalva
 */
public class Control_ResumenPedido  extends javax.swing.JFrame{
    ResumenPedido vista;
    Pedido Vw_rspedido = new Pedido();
    boolean valido= true;
    
    String sucursal = "";
    String distibuidor = "";
    String nombre="";
    String cantidad="";
    String tipo="";
    int cantint=0;

    public Control_ResumenPedido(ResumenPedido vista) {
        
        this.vista = vista;
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        
        iniciaControl();
        
    }
    public void iniciaControl(){
    
}
}
