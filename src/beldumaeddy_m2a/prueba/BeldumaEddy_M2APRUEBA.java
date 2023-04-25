/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beldumaeddy_m2a.prueba;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 0705590545 EDDY BELDUMA
 */
public class BeldumaEddy_M2APRUEBA {

    public static void main(String[] args) {

        ArrayList<Vehiculo> Lista_vehiculo = new ArrayList<Vehiculo>();
        ArrayList<Vendedor> Lista_vendedores = new ArrayList<Vendedor>();
        ArrayList<ventas> Lista_Ventas = new ArrayList<ventas>();
        ventas vt = new ventas();
        Scanner scS = new Scanner(System.in);
        Scanner scN = new Scanner(System.in);
        boolean a = true;
        do {
            System.out.println("SISTEMA DE VENTA DE VEHICULOS");
            System.out.println("1.  CRUD DE VENDEDOR");
            System.out.println("2.  CRUD DE VENTA");
            System.out.println("3.  Registro de ventas");
            System.out.println("4.  Listas ventas");
            System.out.println("5.  Salir");

            try {
                int opc = scN.nextInt();

                switch (opc) {
                    case 1:
                        Vendedor vend = new Vendedor();

                        boolean b = false;
                        do {
                            System.out.println("Registro de vendedor");
                            System.out.println("1. Ingreso de vendedor");
                            System.out.println("2. Consulta de vendedor");
                            System.out.println("3. Lista de vendedor");
                            System.out.println("4. Eliminar Vendedor");
                            System.out.println("5. Modificar vendedor");
                            System.out.println("6. Salir");

                            int op1 = scN.nextInt();
                            switch (op1) {
                                case 1:

                                    System.out.print("Digite la cedula del vendedor: ");
                                    String aux1 = scS.nextLine();
                                    System.out.print("Digite el nombre del vendedor: ");
                                    String aux2 = scS.nextLine();
                                    System.out.print("Digite el apellido del vendedor: ");
                                    String aux3 = scS.nextLine();
                                    System.out.print("Digite la direccion del vendedor: ");
                                    String aux4 = scS.nextLine();
                                    System.out.print("Digite el horario de trabajo del vendedor: ");
                                    String aux5 = scS.nextLine();

                                    vend.setCedula(aux1);
                                    vend.setNombre(aux2);
                                    vend.setApellido(aux3);
                                    vend.setDireccion(aux4);
                                    vend.setHorario_de_trabajo(aux5);

                                    vend.DisponibleVendedor();

                                    Lista_vendedores.add(vend);

                                    break;
                                case 2:
                                    System.out.println("CONSULTA DE VENDEDOR");
                                    System.out.print("Digite la cedula del vendedor: ");
                                    String auxcedu = scS.nextLine().trim(); //el trim elimina los espacios del principio y fin de lo que digite el usuario
                                    boolean encontrar = false;
                                    for (int i = 0; i < Lista_vendedores.size(); i++) {
                                        if (Lista_vendedores.get(i).getCedula().equals(auxcedu)) { //traigo con get el objeto, cogo la cedula con get y comparo con equals 

                                            System.out.println(Lista_vendedores.get(i).toString());
                                            encontrar = true;

                                            i = Lista_vendedores.size();
                                        }
                                        if (encontrar == false) {
                                            System.out.println("Cedula de vendedor no encontrado. No existe");
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Los datos de vendedor son: ");
                                    System.out.println("CEDULA          APELLIDOS           NOMBRE          DIRECCION       HORARIO DE TRABAJO");

                                    for (int i = 0; i < Lista_vendedores.size(); i++) {
                                        Lista_vendedores.get(i).mostrarDatos();
                                    }
                                    break;
                                case 4:
                                    System.out.println("ELIMINAR VENDEDOR");
                                    System.out.print("Digite la cedula del vendedor a ELIMINAR: ");
                                    String auxcedu2 = scS.nextLine().trim(); //el trim elimina los espacios del principio y fin de lo que digite el usuario
                                    boolean encontrar2 = false;
                                    for (int i = 0; i < Lista_vendedores.size(); i++) {
                                        if (Lista_vendedores.get(i).getCedula().equals(auxcedu2)) { //traigo con get el objeto, cogo la cedula con get y comparo con equals 
                                            System.out.println("Los datos del vendedor son: ");
                                            System.out.println(Lista_vendedores.get(i).toString());

                                            Lista_vendedores.remove(i); //se remueve el ovjeto que encontro

                                            System.out.println("Los datos del vendedor se han ELIMINADO");

                                            encontrar2 = true;

                                            i = Lista_vendedores.size();

                                        }
                                        if (!encontrar2) {
                                            System.out.println("Cedula de vendedor no encontrado. No existe");
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("MODIFICAR VENDEDOR");
                                    System.out.print("Digite la cedula del vendedor a MODIFICAR: ");
                                    String auxcedu3 = scS.nextLine().trim(); //el trim elimina los espacios del principio y fin de lo que digite el usuario
                                    boolean encontrar3 = false;
                                    for (int i = 0; i < Lista_vendedores.size(); i++) {
                                        if (Lista_vendedores.get(i).getCedula().equals(auxcedu3)) { //traigo con get el objeto, cogo la cedula con get y comparo con equals 
                                            System.out.println("Los datos del vendedor son: ");
                                            System.out.println(Lista_vendedores.get(i).toString());

                                            System.out.print("Digite el nuevo nombre del vendedor: ");
                                            String nuevNo = scS.nextLine();
                                            Lista_vendedores.get(i).setNombre(nuevNo);
                                            encontrar3 = true;

                                            i = Lista_vendedores.size();

                                        }
                                        if (!encontrar3) {
                                            System.out.println("Cedula de vendedor no encontrado. No existe");
                                        }
                                    }
                                    break;
                                case 6:
                                    System.out.println("Hasta pronto");
                                    b = true;
                                    break;
                                default:
                                    System.out.println("Error.");
                                    break;
                            }
                        } while (!b);
                        break;

                    case 2:
                        Vehiculo vh = new Vehiculo();

                        int opc2 = 0;
                        do {
                            System.out.println("Registro de Vehiculo");
                            System.out.println("1. Ingreso de vehiculo");
                            System.out.println("2. Consulta de vehiculo");
                            System.out.println("3. Lista de vehiculo");
                            System.out.println("4. Eliminar vehiculo");
                            System.out.println("5. Modificar vehiculo");
                            System.out.println("6. Salir");

                            int ops = scN.nextInt();
                            switch (ops) {
                                case 1:

                                    System.out.print("Digite la placa del vehiculo: ");
                                    String aux1v = scS.nextLine();
                                    System.out.print("Digite la marca del vehiculo: ");
                                    String aux2v = scS.nextLine();
                                    System.out.print("Digite el descripcon del vehiculo: ");
                                    String aux3v = scS.nextLine();
                                    System.out.print("Digite el precio del vehiculo: ");
                                    double aux4v = scN.nextDouble();
                                    System.out.print("Digite el año de fabricacion del vehiculo: ");
                                    String auxv5 = scS.nextLine();
                                    System.out.println("Digite el color del auto");
                                    String auxv6 = scS.nextLine();

                                    vh.setPlaca(aux1v);
                                    vh.setMarca(aux2v);
                                    vh.setDescripcion(aux3v);
                                    vh.setPrecio(aux4v);
                                    vh.setAño_de_fabricacion(auxv5);
                                    vh.setColor(auxv6);

                                    Lista_vehiculo.add(vh);

                                    break;
                                case 2:
                                    System.out.println("CONSULTA DE VENDEDOR");
                                    System.out.print("Digite la placa del vechiculo: ");
                                    String auxpla = scS.nextLine().trim(); //el trim elimina los espacios del principio y fin de lo que digite el usuario
                                    boolean encontrar = false;
                                    for (int i = 0; i < Lista_vehiculo.size(); i++) {
                                        if (Lista_vehiculo.get(i).getPlaca().equals(auxpla)) { //traigo con get el objeto, cogo la cedula con get y comparo con equals 

                                            System.out.println(Lista_vehiculo.get(i).toString());
                                            encontrar = true;

                                            i = Lista_vehiculo.size();
                                        }
                                        if (encontrar == false) {
                                            System.out.println("Placa del vehiculo no encontrado. No existe");
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("LOS DATOS DE LOS VEHICULOS SON:");
                                    System.out.println("PLACA       MARCA       DESCRIPCION         PRECIO      Año de fabricacion      COLOR");

                                    for (int i = 0; i < Lista_vehiculo.size(); i++) {
                                        vh.mostrarDatos();
                                    }
                                    break;
                                case 4:
                                    System.out.println("ELIMINAR VEHICULO");
                                    System.out.print("Digite la placa del vehiculo a ELIMINAR: ");
                                    String auxvh2 = scS.nextLine().trim(); //el trim elimina los espacios del principio y fin de lo que digite el usuario
                                    boolean encontrar2 = false;
                                    for (int i = 0; i < Lista_vehiculo.size(); i++) {
                                        if (Lista_vehiculo.get(i).getPlaca().equals(auxvh2)) { //traigo con get el objeto, cogo la cedula con get y comparo con equals 
                                            System.out.println("Los datos del vehiculo son: ");
                                            System.out.println(Lista_vehiculo.get(i).toString());

                                            Lista_vendedores.remove(i); //se remueve el ovjeto que encontro

                                            System.out.println("Los datos del vehiculo se han ELIMINADO");

                                            encontrar2 = true;

                                            i = Lista_vehiculo.size();

                                        }
                                        if (!encontrar2) {
                                            System.out.println("Placa de vehiculo no encontrado. No existe");
                                        }
                                    }
                                    break;
                                case 5:
                                    System.out.println("MODIFICAR VENDEDOR");
                                    System.out.print("Digite la cedula del vendedor a MODIFICAR: ");
                                    String auxcedu3 = scS.nextLine().trim(); //el trim elimina los espacios del principio y fin de lo que digite el usuario
                                    boolean encontrar3 = false;
                                    for (int i = 0; i < Lista_vendedores.size(); i++) {
                                        if (Lista_vendedores.get(i).getCedula().equals(auxcedu3)) { //traigo con get el objeto, cogo la cedula con get y comparo con equals 
                                            System.out.println("Los datos del vendedor son: ");
                                            System.out.println(Lista_vendedores.get(i).toString());
                                            System.out.println("Seleccione el atributo que desea modificar:");
                                            System.out.println("1. Placa");
                                            System.out.println("2. Marca");
                                            System.out.println("3. Descripcion");
                                            System.out.println("4. Precio");
                                            System.out.println("5. Año de fabricacion");
                                            System.out.println("6. Color");
                                            int var = scN.nextInt();
                                            switch (var) {
                                                case 1:
                                                    System.out.print("Digite la nueva placa del vehiculo: ");
                                                    String nuevNo = scS.nextLine();
                                                    Lista_vehiculo.get(i).setPlaca(nuevNo);
                                                    break;
                                                case 2:
                                                    System.out.print("Digite la nueva marca del vehiculo: ");
                                                    String nuevNo1 = scS.nextLine();
                                                    Lista_vehiculo.get(i).setMarca(nuevNo1);
                                                    break;
                                                case 3:
                                                    System.out.print("Digite la nueva descripcion del vehiculo: ");
                                                    String nuevNo2 = scS.nextLine();
                                                    Lista_vehiculo.get(i).setDescripcion(nuevNo2);
                                                    break;
                                                case 4:
                                                    System.out.print("Digite el nuevo precio del vehiculo: ");
                                                    double nuevNo3 = scN.nextDouble();
                                                    Lista_vehiculo.get(i).setPrecio(nuevNo3);
                                                    break;
                                                case 5:
                                                    System.out.print("Digite el nuevo año de fabricacion del vehiculo: ");
                                                    String nuevNo4 = scS.nextLine();
                                                    Lista_vehiculo.get(i).setAño_de_fabricacion(nuevNo4);
                                                    break;
                                                case 6:
                                                    System.out.print("Digite el nuevo color del vehiculo: ");
                                                    String nuevNo5 = scS.nextLine();
                                                    Lista_vehiculo.get(i).setColor(nuevNo5);
                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }
                                            System.out.println("Se ha modificado con exito!");
                                            encontrar3 = true;

                                            i = Lista_vendedores.size();

                                        }
                                        if (!encontrar3) {
                                            System.out.println("Placa de vehiculo no encontrado. No existe");
                                        }
                                    }
                                    break;
                                case 6:
                                    System.out.println("Hasta pronto");
                                    opc2 = 1;
                                    break;
                                default:
                                    System.out.println("Error.");
                                    break;
                            }
                        } while (opc2 == 0);
                        break;
                    case 3:

                        if (Lista_vendedores.isEmpty()) {

                            System.out.println("No existen datos");

                        }
                        if (!Lista_vendedores.isEmpty()) {
                            System.out.println("REGISTRO DE VENTAS");
                            System.out.print("Digite la cedula del vendedor: ");
                            String aux1vt = scS.nextLine();
                            boolean encontrar = false;
                            for (int i = 0; i < Lista_vendedores.size(); i++) {
                                if (Lista_vendedores.get(i).getCedula().equals(aux1vt)) {

                                    System.out.println(Lista_vendedores.get(i).toString());

                                    vt.setCedulaVend(aux1vt);

                                    encontrar = true;

                                    i = Lista_vendedores.size();
                                }
                                if (encontrar == false) {
                                    System.out.println("Cedula del vendedor no encontrado. No existe");
                                }
                            }
                            }

                            if (Lista_vehiculo.isEmpty()) {

                                System.out.println("No existen datos");

                            }
                            if (!Lista_vehiculo.isEmpty()) {
                                System.out.print("Digite la placa del vehiculo: ");
                                String aux2vt = scS.nextLine();
                                boolean encontrar1 = false;
                                for (int i = 0; i < Lista_vehiculo.size(); i++) {
                                    if (Lista_vehiculo.get(i).getPlaca().equals(aux2vt)) { //traigo con get el objeto, cogo la cedula con get y comparo con equals 

                                        System.out.println(Lista_vehiculo.get(i).toString());
                                        encontrar1 = true;

                                        vt.setPlacaVeh(aux2vt);

                                        System.out.print("Digite la cantidad de vehiculos: ");
                                        int aux3vt = scN.nextInt();
                                        vt.setCantVeh(aux3vt);
                                        
                                        double aux4vt = aux3vt * Lista_vehiculo.get(i).getPrecio();
                                        vt.setValorVent(aux4vt);
                                        Lista_Ventas.add(vt);
                                        i = Lista_vehiculo.size();
                                    }
                                    if (encontrar1 == false) {
                                        System.out.println("Placa del vehiculo no encontrado. No existe");
                                    }
                                }
                            }

                        break;
                    case 4:
                        System.out.println("Los datos de las ventas son: ");
                        System.out.println("Cedula de Vendedor         Placa de Vehiculo           Cantidad de vehiculos          Valor total");

                        for (int i = 0; i < Lista_Ventas.size(); i++) {
                            Lista_Ventas.get(i).mostrarDatos();
                        }
                        break;
                    case 5:
                        a = false;
                        break;
                    default:
                        System.out.println("ERROR: Opcion no valida");
                        a = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scN.next();
            }
        } while (a == true);
    }

}
