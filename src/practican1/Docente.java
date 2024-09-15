/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practican1;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Docente extends Empleado {
    private String categoria;
    private int gradoAcademico;
    
    Docente(){
        super("", 0, 0, 0);
        this.categoria = "";
        this.gradoAcademico = 0;
    }

    Docente(String categoria, int gradoAcademico, String nombre, double sueldoBase, int numeroEmpleado, int antiguedad) {
        super(nombre, sueldoBase, numeroEmpleado, antiguedad);
        this.categoria = categoria;
        this.gradoAcademico = gradoAcademico;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void SueldoN(double bono) {
        switch(this.gradoAcademico){
            //Licenciatura
            case 1: 
                super.setSueldoFinal(super.getSueldoBase()+bono);
                break;
            //Mastría
            case 2: 
                super.setSueldoFinal(super.getSueldoBase()+(bono*3));
                break;
            //Doctorado
            case 3: 
                super.setSueldoFinal(super.getSueldoBase()+(bono*5));
                break;
            default: break;
        } 
    }
    
    @Override
    public void ToString(){
        
        String grado = "";
        switch (gradoAcademico) {
            case 1:
                grado = "Licenciatura";
                break;
            case 2:
                grado = "Maestría";
                break;
            case 3:
                grado = "Doctorado";
                break;
            default:
                grado = "Sin grado académico";
                break;
        }

        
        String message = String.format(
                "Nombre: %s\n"
                + "Numero de Empleado: %d\n"
                + "Categoría: %s\n"
                + "Grado Academico: %s\n"
                + "Antiguedad: %d\n años"
                + "Sueldo Base: S/ %.2f\n"
                + "Sueldo Final: S/ %.2f\n", 
                super.getNombre(),
                super.getNumeroEmpleado(),
                this.categoria,
                grado,
                super.getAntiguedad(),
                super.getSueldoBase(),
                super.getSueldoFinal()
                );
       
        JOptionPane.showMessageDialog(null, message);
    }
    
}
