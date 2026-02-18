/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Estudio-Trabajo
 */
public class Mecanico extends Empleado{
    private double bonoReparacion = 500;

    public Mecanico(String nombre) {
        super(nombre);
    }

    

    public double getBonoReparacion() {
        return bonoReparacion;
    }

    public void setBonoReparacion(double bonoReparacion) {
        this.bonoReparacion = bonoReparacion;
    }

    

    @Override
    public String trabajar() {
          String msg;
      return msg = "El " + nombre +  " esta revisando y reparando coches."; 
    }

    @Override
    public String toString() {
        
        return "Mecanico{" + "bonoReparacion=" + bonoReparacion + '}';
    }

    @Override
    public double calcularSueldo() {
        double sueldoTotal = super.sueldoBase + bonoReparacion;
      return  sueldoTotal;
    }
    
}
