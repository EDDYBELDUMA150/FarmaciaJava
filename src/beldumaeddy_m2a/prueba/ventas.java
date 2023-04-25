/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beldumaeddy_m2a.prueba;

/**
 *
 * @author elvis
 */
public class ventas {
    private String cedulaVend;
    private String placaVeh;
    private int cantVeh;
    private double ValorVent;

    public ventas() {
    }

    public ventas(String cedulaVend, String placaVeh, int cantVeh, double ValorVent) {
        this.cedulaVend = cedulaVend;
        this.placaVeh = placaVeh;
        this.cantVeh = cantVeh;
        this.ValorVent = ValorVent;
    }

    public String getCedulaVend() {
        return cedulaVend;
    }

    public void setCedulaVend(String cedulaVend) {
        this.cedulaVend = cedulaVend;
    }

    public String getPlacaVeh() {
        return placaVeh;
    }

    public void setPlacaVeh(String placaVeh) {
        this.placaVeh = placaVeh;
    }

    public int getCantVeh() {
        return cantVeh;
    }

    public void setCantVeh(int cantVeh) {
        this.cantVeh = cantVeh;
    }

    public double getValorVent() {
        return ValorVent;
    }

    public void setValorVent(double ValorVent) {
        this.ValorVent = ValorVent;
    }

    @Override
    public String toString() {
        return "Estos son los datos de vendedor: " + "Cedula de Vendedor= " + cedulaVend + ", Placa de vendedor= " + placaVeh + ", Cantidad de vehiculos= " + cantVeh + ", Valor de la Venta= " + ValorVent + '}';
    }
    
    public void mostrarDatos(){
        System.out.println(cedulaVend+"         "+placaVeh+"        "+cantVeh+"     "+ValorVent);
    }
    
    public void calcularVenta(){
        
    }
}
