/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Model_Medicamento;
import javax.swing.JOptionPane;
import view.Pedido;
import view.ResumenPedido;

/**
 *
 * @author Shalva
 */
public class Control_ResumenPedido extends javax.swing.JFrame {

    ResumenPedido vistaRS;
    Pedido Vw_rspedido = new Pedido();
    Model_Medicamento md_medicamento;
    boolean valido = true;

    public Control_ResumenPedido(ResumenPedido vista, Model_Medicamento md_medicamento, Pedido Vw_rspedido) {

        this.Vw_rspedido = Vw_rspedido;
        this.md_medicamento = md_medicamento;
        this.vistaRS = vista;
        this.vistaRS.setLocationRelativeTo(null);
        this.vistaRS.setVisible(true);

        iniciaControl();
    }

    public void iniciaControl() {
        //System.out.println(md_medicamento.getList_medic().toString());
        vistaRS.getJlMedicamento().setText(md_medicamento.getList_medic().get(md_medicamento.getIndx()).getMd_nombre().toString());
        vistaRS.getjLabelCantidad().setText(String.valueOf(md_medicamento.getList_medic().get(md_medicamento.getIndx()).getMd_cantidad()).toString());
        vistaRS.getJlsucursa().setText(md_medicamento.getList_medic().get(md_medicamento.getIndx()).getMd_sucursal().toString());
        vistaRS.getJltipomedi().setText(md_medicamento.getList_medic().get(md_medicamento.getIndx()).getMd_tipo().toString());
        vistaRS.setTitle(md_medicamento.getList_medic().get(md_medicamento.getIndx()).getMd_distribuidor().toString());
        vistaRS.getJltitulo().setText(md_medicamento.getList_medic().get(md_medicamento.getIndx()).getMd_distribuidor().toString());

        vistaRS.getBtcancelar().addActionListener(l -> botonCancelar());
        vistaRS.getBtenviar().addActionListener(l->botonAceptar());
    }

    public void botonCancelar() {
        vistaRS.dispose();
    }

    public void botonAceptar() {
        String sucursal = md_medicamento.getList_medic().get(0).getMd_sucursal().toString();
        String distibuidor = md_medicamento.getList_medic().get(0).getMd_distribuidor().toString();
        String nombre = md_medicamento.getList_medic().get(0).getMd_nombre().toString();
        String tipo = md_medicamento.getList_medic().get(0).getMd_tipo().toString();
        int cantint = md_medicamento.getList_medic().get(0).getMd_cantidad();

        md_medicamento.guardarMedicamento(nombre, tipo, cantint, distibuidor, sucursal);
        JOptionPane.showMessageDialog(null, "Pedido Enviado");
        limpiar();
        vistaRS.dispose();

    }
    
    public void limpiar(){
        Vw_rspedido.getTxtNombreM().setText("");
        Vw_rspedido.getTxtCantidadP().setText("");
        Vw_rspedido.getCbxPrincipal().setSelected(false);
        Vw_rspedido.getCbxSecundario().setSelected(false);
        Vw_rspedido.getCbxTipo().setSelectedIndex(0);
        Vw_rspedido.getBtnGDistribuidor().clearSelection();
    }
}
