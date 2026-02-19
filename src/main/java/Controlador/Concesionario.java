/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.Empleado;
import Model.Gerente;
import Model.Mecanico;
import Model.Vendedor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudio-Trabajo
 */
public class Concesionario {
    public String nombre;
    public static ArrayList<Empleado> empleados = new ArrayList<>();
    static Scanner sca = new Scanner(System.in);
    public Concesionario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "El concecionario " + nombre ;
    }
    
     public static void test(){
    Concesionario.agregarEmpleado(new Vendedor("Luis"));
    Concesionario.agregarEmpleado(new Vendedor("Pedro"));
    Concesionario.agregarEmpleado(new Mecanico("Jose"));
    Concesionario.agregarEmpleado(new Mecanico("Nati"));
    Concesionario.agregarEmpleado(new Gerente("Isa"));
    Concesionario.agregarEmpleado(new Gerente("Paco"));
    }
         
         
           public static void crearConcecionario(){
        
        System.out.println("Cual sera el nombre del concecionario? ");
        String nombre = sca.nextLine();
        
       Concesionario concecionario = new Concesionario(nombre);
               System.out.println( concecionario + " se ha creado correctamente");
    }
    
    public static void agregarEmpleado() {
       System.out.println("Que tipo de empleado crearas? Vendedor, Mecanico o Gerente");
        String tipoemp =sca.nextLine();
        
                System.out.println("Cual es el nombre del empleado?");
                String nombre = sca.nextLine();
        Empleado emp = null;
        switch (tipoemp.toLowerCase()) {
            case "vendedor":
                emp = new Vendedor(nombre);
                break;
            case "mecanico":
                
                emp = new Mecanico(nombre);
                break;
            case "gerente":
                
                emp = new Gerente(nombre);
                break;
            default:
                System.out.println("El tipo de empleado no es correcto");
                break;
        }
        if (emp != null) {
    Concesionario.agregarEmpleado(emp);
    System.out.println("Empleado agregado correctamente");
}   
       }
    
    
    public static  void agregarEmpleado(Empleado emp){
      
        empleados.add(emp);
        
         
    }
    
    public static void trabajoTodos(){
        for(Empleado e : empleados){
            System.out.println(e.trabajar());   
        }
    }
    
    public static void mostrarSueldo(){
        double totalvendedores = 0;
        double totalmecanico = 0;
        double totalgerente = 0;
        
        for(Empleado e : empleados){
            if(e instanceof Vendedor){
               
            System.out.println("Vendedor " + e.calcularSueldo());
                
            }
            if(e instanceof Mecanico){
                
            System.out.println("Mecanico " + e.calcularSueldo());
               
            }
            if(e instanceof Gerente){
                
            System.out.println("Gerente " + e.calcularSueldo());
               
            }
        }
        System.out.println("");
            
    }
       public static void balanceSueldos() {
           double total=0;
        for(Empleado e : empleados){
                total+=e.calcularSueldo();        
        }
           System.out.println("Total de sueldos: " + total);
    }


}
