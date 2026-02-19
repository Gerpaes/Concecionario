/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import Controlador.Concesionario;
import Model.Empleado;
import Model.Gerente;
import Model.Mecanico;
import Model.Vendedor;
import java.util.Scanner;

/**
 *
 * @author Estudio-Trabajo
 */
public class Main {
   
    static Scanner sca = new Scanner(System.in);
    
    public static void main(String[] args) {
        Concesionario.crearConcecionario();
        Concesionario.test();
        menu();
        
    }
    
  
    
    public static void menu(){
       
        int opc = 0;
        boolean exit = false;
        do { 
            System.out.println("1. Crear empleado");
            System.out.println("2. Hacer trabajar a los empleados");
            System.out.println("3. Mostrar el sueldo de un empleado");
            System.out.println("4. Balance de todos los sueldos");
            System.out.println("5. salir");
            opc=sca.nextInt();
            sca.nextLine();

            switch (opc) {
                case 1:
                    Concesionario.agregarEmpleado();
                    
                    break;
                case 2:
                    Concesionario.trabajoTodos();
                    
                    break;
                case 3:
                    Concesionario.mostrarSueldo();
                    
                    break;
                case 4:
                    Concesionario.balanceSueldos();
                    
                    break;
                case 5:
                    exit = true;
                    
                    break;
                    
                default:
                    throw new AssertionError();
            }
            
        } while (!exit);
    }

    
    
   
}
    

 