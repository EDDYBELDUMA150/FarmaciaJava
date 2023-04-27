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
    private ArrayList<Medicamento> list_medic_frames = new ArrayList<Medicamento>();
    private ArrayList<Medicamento> list_medic_regi = new ArrayList<Medicamento>();
    Medicamento md = new Medicamento();
    private static int indx = 0;

    public ArrayList<Medicamento> getList_medic() {
        return list_medic_frames;
    }

    public void setList_medic(ArrayList<Medicamento> list_medic_frames) {
        this.list_medic_frames = list_medic_frames;
    }

    public ArrayList<Medicamento> getList_medic_regi() {
        return list_medic_regi;
    }

    public void setList_medic_regi(ArrayList<Medicamento> list_medic_regi) {
        this.list_medic_regi = list_medic_regi;
    }
    
    public void obtenerMedicament(String nombre, String tipo, int cantidad, String distribuidor, String sucursal){
        list_medic_frames.add(new Medicamento(nombre, tipo, cantidad, distribuidor, sucursal));
    }
    
    public void guardarMedicamento(String nombre, String tipo, int cantidad, String distribuidor, String sucursal){
        list_medic_frames.add(new Medicamento(nombre, tipo, cantidad, distribuidor, sucursal));
    }

    public int getIndx() {
        return indx;
    }

    public void setIndx(int indx) {
        Model_Medicamento.indx = indx;
    }

    @Override
    public String toString() {
        return "Model_Medicamento{" + "list_medic=" + list_medic_frames + '}';
    }
    
    public void buscarMedicamento(String nombre){
        
    }
}
