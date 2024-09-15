/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practican1;

/**
 *
 * @author USER
 */
public class Empleado {
    private String nombre;
    private double sueldoBase;
    private int numeroEmpleado;
    private int antiguedad;
    private double sueldoFinal;

    public double getSueldoFinal() {
        return sueldoFinal;
    }

    public void setSueldoFinal(double sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }

    public Empleado(String nombre, double sueldoBase, int numeroEmpleado, int antiguedad) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.numeroEmpleado = numeroEmpleado;
        this.antiguedad = antiguedad;
        this.sueldoFinal = sueldoBase;
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

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public void ToString(){}
    
    public String Mensage() {
        return "Examen Práctico";
    }
    
    public void SueldoN(double bono){
        
    }
    
}
