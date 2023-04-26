/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Medicamento;
import Model.Model_Medicamento;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JOptionPane;
import view.Pedido;
import view.ResumenPedido;

/**
 *
 * @author OWNER
 */
public class Control_Medicamento extends javax.swing.JFrame{
    Pedido vista;
    ResumenPedido Vw_rspedido = new ResumenPedido();
    Model_Medicamento Md_medicamento = new Model_Medicamento();
    boolean valido= true;
    
    String sucursal = "";
    String distibuidor = "";
    String nombre="";
    String cantidad="";
    String tipo="";
    int cantint=0;

    public Control_Medicamento(Pedido vista) {
        
        this.vista = vista;
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        
        iniciaControl();
        
    }
    
    
    
    public void iniciaControl(){
        vista.getBtnOK().addActionListener(l-> rgdatos());
    }
    
    public void rgdatos(){
        if(valido){
            
            if(vista.getRdbCemefar().isSelected()){
                distibuidor = "CEMEFAR";
            }else if(vista.getRdbCofarma().isSelected()){
                distibuidor = "COFARMA";
            }else if(vista.getRdbEmpsephar().isSelected()){
                distibuidor = "EMPSEPHAR";
            }
            
           

            if(!vista.getCbxPrincipal().isSelected() && !vista.getCbxSecundario().isSelected()){
                JOptionPane.showMessageDialog(null, "debe seleccionar uno o ambas");
                sucursal = "";
            }else if(vista.getCbxPrincipal().isSelected()){
                sucursal = "Calle de la Rosa n. 28";
            } else if(vista.getCbxSecundario().isSelected()){
                sucursal = "Calle Alcazabilla n. 3";
            } else if(vista.getCbxPrincipal().isSelected() && vista.getCbxSecundario().isSelected()){
                sucursal = "Calle de la Rosa n.28 y para la Calle Alcazabilla n.3";
            }
       
            
            nombre = vista.getTxtNombreM().getText();
            String seleccion="Seleccione";
            if(vista.getCbxTipo().getSelectedItem()==seleccion){
                JOptionPane.showMessageDialog(null, "debe seleccionar el tipo de medicamento");
            }else{
                tipo =(String) vista.getCbxTipo().getSelectedItem();
            }
            
            cantidad = vista.getTxtCantidadP().getText();
            cantint = Integer.parseInt(cantidad);
      
            
            Md_medicamento.registrarMedicamento(nombre ,  tipo, cantint , distibuidor, sucursal);
            System.out.println(nombre +" "+ tipo +" "+ cantint+" "+ distibuidor +" "+ sucursal);
        }else{
            
        }
        
        ResumenPedido ped = new ResumenPedido();
        Control_ResumenPedido cont = new Control_ResumenPedido(ped);
    }
    
    public void mostrarRsPedido(){
        Vw_rspedido.setTitle(distibuidor);
        
        Vw_rspedido.getjLabelCantidad().setText(vista.getTxtCantidadP().toString());
        Vw_rspedido.getJlMedicamento().setText(vista.getTxtNombreM().toString());
    }
}
