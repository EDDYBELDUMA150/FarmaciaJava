/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beldumaeddy_m2a.prueba;

/**
 *
 * @author 0705590545 EDDY BELDUMA
 */
public class Vehiculo {
    //definir atributos
    private String Placa;
    private String Marca;
    private String Descripcion;
    private double Precio;
    private String Año_de_fabricacion;
    private String Color;
    //definir constructores
    public Vehiculo(String Placa, String Marca, String Descripcion, double precio, String Año_de_fabricacion, String Color) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Descripcion = Descripcion;
        this.Precio = precio;
        this.Año_de_fabricacion = Año_de_fabricacion;
        this.Color = Color;
    }

    public Vehiculo() {
        
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    
    public String getAño_de_fabricacion() {
        return Año_de_fabricacion;
    }

    public void setAño_de_fabricacion(String Año_de_fabricacion) {
        this.Año_de_fabricacion = Año_de_fabricacion;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Datos de vehiculos: " + "Placa=" + Placa + ", Marca=" + Marca + ", Descripcion=" + Descripcion + ", Precio=" + Precio + ", A\u00f1o_de_fabricacion=" + Año_de_fabricacion + ", Color=" + Color + '}';
    }

    public void mostrarDatos(){
        System.out.println(Placa+"      "+Marca+"       "+Descripcion+"     "+Precio+"      "+Año_de_fabricacion+"      "+Color);
        System.out.println("");
    }
    
    public void KMrecorrido (int KM){
        System.out.println("El vehiculo recorrre "+KM+" Km");
    }
    
    public void acelerar(int valorac){
        System.out.println("El vehiculo acelerar de o a "+valorac+" por hora.");
    }
    
    public void girar (String direc){
        System.out.println("Usted esta girando hacia la "+direc);
    }
}
