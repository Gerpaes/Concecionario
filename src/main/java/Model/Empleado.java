/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Vista.Trabajo;

/**
 *
 * @author Estudio-Trabajo
 */
public abstract  class Empleado implements Trabajo{
    protected String nombre;
    protected double sueldoBase = 1200;
    protected int horastrabajo = 8;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

   
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldoBase=" + sueldoBase + ", horastrabajo=" + horastrabajo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorastrabajo() {
        return horastrabajo;
    }

    public void setHorastrabajo(int horastrabajo) {
        this.horastrabajo = horastrabajo;
    }

    public double calcularSueldo(double sueldo) {
        return sueldoBase;
    }
    
}
