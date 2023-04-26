/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author elvis
 */
public class Medicamento {
    private String Md_nombre;
    private String Md_tipo;
    private int Md_cantidad;
    private String Md_distribuidor;
    private String Md_sucursal;

    public Medicamento() {
    }

    public Medicamento(String Md_nombre, String Md_tipo, int Md_cantidad, String Md_distribuidor, String Md_sucursal) {
        this.Md_nombre = Md_nombre;
        this.Md_tipo = Md_tipo;
        this.Md_cantidad = Md_cantidad;
        this.Md_distribuidor = Md_distribuidor;
        this.Md_sucursal = Md_sucursal;
    }

    public String getMd_nombre() {
        return Md_nombre;
    }

    public void setMd_nombre(String Md_nombre) {
        this.Md_nombre = Md_nombre;
    }

    public String getMd_tipo() {
        return Md_tipo;
    }

    public void setMd_tipo(String Md_tipo) {
        this.Md_tipo = Md_tipo;
    }

    public int getMd_cantidad() {
        return Md_cantidad;
    }

    public void setMd_cantidad(int Md_cantidad) {
        this.Md_cantidad = Md_cantidad;
    }

    public String getMd_distribuidor() {
        return Md_distribuidor;
    }

    public void setMd_distribuidor(String Md_distribuidor) {
        this.Md_distribuidor = Md_distribuidor;
    }

    public String getMd_sucursal() {
        return Md_sucursal;
    }

    public void setMd_sucursal(String Md_sucursal) {
        this.Md_sucursal = Md_sucursal;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "Md_nombre=" + Md_nombre + ", Md_tipo=" + Md_tipo + ", Md_cantidad=" + Md_cantidad + ", Md_distribuidor=" + Md_distribuidor + ", Md_sucursal=" + Md_sucursal + '}';
    }
    
    
}
