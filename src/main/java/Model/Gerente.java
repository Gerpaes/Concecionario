/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Estudio-Trabajo
 */
public class Gerente extends Empleado {

  private double bonusGestion = 1000;
  private int horastrabajo = 6;       

    public Gerente(String nombre) {
        super(nombre);
    }

    public double getBonusGestion() {
        return bonusGestion;
    }

    public void setBonusGestion(double bonusGestion) {
        this.bonusGestion = bonusGestion;
    }

    public int getHorastrabajo() {
        return horastrabajo;
    }

    public void setHorastrabajo(int horastrabajo) {
        this.horastrabajo = horastrabajo;
    }


    @Override
    public String trabajar() {
           String msg;
      return msg = "El " + nombre + " esta supervisando el concecionario y coordinando al equipo."; 
    }

    @Override
    public double calcularSueldo() {
         double sueldoTotal = super.sueldoBase + bonusGestion;
      return  sueldoTotal;
    }
        
}
