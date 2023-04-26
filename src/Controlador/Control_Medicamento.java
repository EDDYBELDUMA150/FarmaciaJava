/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Model_Medicamento;
import view.Pedido;
import view.ResumenPedido;

/**
 *
 * @author OWNER
 */
public class Control_Medicamento {
    Pedido Vw_pedido = new Pedido();
    ResumenPedido Vw_rspedido = new ResumenPedido();
    Model_Medicamento Md_medicamento = new Model_Medicamento();
    boolean valido;
    
    String sucursal = "";
    String distibuidor = "";
    
    public void iniciaControl(){
        Vw_pedido.setVisible(true);
        Vw_pedido.getBtnOK().addActionListener(l-> rgdatos());
    }
    
    public void rgdatos(){
        if(valido){
            
            if(Vw_pedido.getRdbCemefar().isSelected()){
                distibuidor = "CEMEFAR";
            }else if(Vw_pedido.getRdbCofarma().isSelected()){
                distibuidor = "COFARMA";
            }else if(Vw_pedido.getRdbEmpsephar().isSelected()){
                distibuidor = "EMPSEPHAR";
            }
            

            if(Vw_pedido.getCbxPrincipal().isSelected()){
                sucursal = "Calle de la Rosa n. 28";
            } else if(Vw_pedido.getCbxSecundario().isSelected()){
                sucursal = "Calle Alcazabilla n. 3";
            } else if(Vw_pedido.getCbxPrincipal().isSelected() && Vw_pedido.getCbxSecundario().isSelected()){
                sucursal = "Para la farmacia situada en Calle de la Rosa n.28 y para la situada en Calle Alcazabilla n.3";
            }
            
            Md_medicamento.registrarMedicamento(Vw_pedido.getTxtNombreM().getText().toString(), Vw_pedido.getCbxTipo().getSelectedItem().toString(), 
                   Integer.parseInt(Vw_pedido.getTxtCantidadP().toString()), distibuidor, sucursal);
        }else{
            
        }
    }
    
    public void mostrarRsPedido(){
        Vw_rspedido.setTitle(distibuidor);
        
        Vw_rspedido.getjLabelCantidad().setText(Vw_pedido.getTxtCantidadP().toString());
        Vw_rspedido.getJlMedicamento().setText(Vw_pedido.getTxtNombreM().toString());
    }
}
