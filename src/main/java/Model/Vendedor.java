/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Estudio-Trabajo
 */
public class Vendedor extends Empleado {
    private double comision = 400;

    public Vendedor(String nombre) {
        super(nombre);
    }

    

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "comision=" + comision + '}';
    }


    @Override
    public String trabajar() {
        String msg;
      return msg = "El " + nombre + " esta atendiendo a clientes y mostrando coches.";  
    }

    @Override
    public double calcularSueldo() {
     double sueldoTotal = super.sueldoBase + comision;
      return  sueldoTotal;
       
    }
    
}
