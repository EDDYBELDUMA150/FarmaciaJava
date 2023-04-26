/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author OWNER
 */
public class Model_Medicamento {
    ArrayList<Medicamento> list_medic = new ArrayList<Medicamento>();
    Medicamento md = new Medicamento();
    
    public void registrarMedicamento(String nombre, String tipo, int cantidad, String distribuidor, String sucursal){
        list_medic.add(new Medicamento(nombre, tipo, cantidad, distribuidor, sucursal));
    }

    @Override
    public String toString() {
        return "Model_Medicamento{" + "list_medic=" + list_medic + '}';
    }
    
    public void buscarMedicamento(String nombre){
        
    }
}
