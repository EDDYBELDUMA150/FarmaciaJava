/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beldumaeddy_m2a.prueba;

/**
 *
 * @author 0705590545 EDDY BELDUMA
 */
public class Vendedor {
    //definidos los atributos de la clase
    private String cedula;
    private String Apellido;
    private String Nombre;
    private String Direccion;
    private String Horario_de_trabajo;
    //constructores 
    public Vendedor(String cedula, String Apellido, String Nombre, String Direccion, String Horario_de_trabajo) {
        this.cedula = cedula;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Horario_de_trabajo = Horario_de_trabajo;
    }
    
    public Vendedor(){
        
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getHorario_de_trabajo() {
        return Horario_de_trabajo;
    }

    public void setHorario_de_trabajo(String Horario_de_trabajo) {
        this.Horario_de_trabajo = Horario_de_trabajo;
    }
    
    //Siempre debe estas un toStirng y mostrarDatos para listar un crud
    @Override
    public String toString() {
        return "Los datos del vendedor son: " + "cedula=" + cedula + ", Apellido=" + Apellido + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", Horario_de_trabajo=" + Horario_de_trabajo + '}';
    }
    
    public void mostrarDatos(){
        System.out.println(cedula+"           "+Apellido+"         "+Nombre+"          "+Direccion+"           "+Horario_de_trabajo);
        
    }
    //metodos
    public void ventasAnuales(int ventas){
        System.out.println("Las ventas al año son: "+ventas);
    }
    
    public void registrarAutos(int numautos){
        System.out.println("El vendedor debe registrar "+numautos+" al mes.");
    }
    
    public void DisponibleVendedor(){
        System.out.println("Este vendedor esta disponible");
    }
    
    public boolean ValidarCedula(String cedula){
        return cedula.matches("^[0-9]{10}^");
    }
}
