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
public class Control_Medicamento extends javax.swing.JFrame {

    Pedido vista;
    ResumenPedido ped = new ResumenPedido();
    Model_Medicamento Md_medicamento = new Model_Medicamento();
    boolean valido = true;
    int i = Md_medicamento.getIndx();

    String sucursal = "";
    String distibuidor = "";
    String nombre = "";
    String cantidad = "";
    String tipo = "";
    int cantint = 0;

    public Control_Medicamento(Pedido vista) {

        this.vista = vista;
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);

        iniciaControl();
        
    }

    public void iniciaControl() {
        vista.getBtnOK().addActionListener(l -> rgdatos());
        
    }

    public void rgdatos() {

        nombre = vista.getTxtNombreM().getText().toString();
        cantidad = vista.getTxtCantidadP().getText().toString();

        if (validarCampos(valido) && validarCheckComboRD(valido)) {

            cantint = Integer.parseInt(cantidad);

            Md_medicamento.obtenerMedicament(nombre, tipo, cantint, distibuidor, sucursal, i++);
            Control_ResumenPedido cont = new Control_ResumenPedido(ped, Md_medicamento, vista);
        } else {
            JOptionPane.showMessageDialog(null, "Hay campos con valores incorrectos o estan vacios");
           
        }

        System.out.println(Md_medicamento.getList_medic_regi().toString());
        Md_medicamento.setIndx(i);
        //System.out.println(Md_medicamento.getList_medic().toString());
    }

    public boolean validarCampos(boolean val) {
        if (vista.getTxtNombreM().equals("") || !validarNombre(nombre)) {
            val = false;
        }
        if (vista.getTxtCantidadP().equals("") || !validarNumero(cantidad)) {
            val = false;
        }
        return val;
    }

    public static boolean validarNombre(String nombre) {
        // Permitir letras mayúsculas y minúsculas y espacios
        String regex = "[a-zA-Z]+";
        return nombre.trim().matches(regex);
    }

    public static boolean validarNumero(String number) {
        // Permitir letras mayúsculas y minúsculas y espacios
        String regex = "^\\d{1,5}$";
        return number.trim().matches(regex);
    }
    
    public boolean validarCheckComboRD(boolean val) {
        if (vista.getCbxPrincipal().isSelected() && vista.getCbxSecundario().isSelected()) {
                sucursal = "Calle de la Rosa n.28 y para la Calle Alcazabilla n.3";
            } else if (vista.getCbxPrincipal().isSelected()) {
                sucursal = "Calle de la Rosa n. 28";
            } else if (vista.getCbxSecundario().isSelected()) {
                sucursal = "Calle Alcazabilla n. 3";
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar uno o ambas");
                
                val = false;
            }
        
        if (vista.getRdbCemefar().isSelected()) {
                distibuidor = "CEMEFAR";
            } else if (vista.getRdbCofarma().isSelected()) {
                distibuidor = "COFARMA";
            } else if (vista.getRdbEmpsephar().isSelected()) {
                distibuidor = "EMPSEPHAR";
            } else {
                JOptionPane.showMessageDialog(null, "Debe seleccionar uno");
                
                val=false;
            }
        
        String seleccion = "Seleccione";
            if (vista.getCbxTipo().getSelectedItem() == seleccion) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar el tipo de medicamento");
                
                val = false;
            } else {
                tipo = (String) vista.getCbxTipo().getSelectedItem();
            }
        
        return val;
    }
}
