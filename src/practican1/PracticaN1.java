/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practican1;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class PracticaN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        
        String sueldoText = JOptionPane.showInputDialog("Ingrese su sueldo: ");
        double sueldo = Double.parseDouble(sueldoText);
        
        String numEmpText = JOptionPane.showInputDialog("Ingrese su Numero de Empleado: ");
        int num = Integer.parseInt(numEmpText);
        
        String antText = JOptionPane.showInputDialog("Ingrese su Antiguedad: ");
        int antiguedad = Integer.parseInt(antText);

        String category = JOptionPane.showInputDialog("Ingrese su Categoria: ");
        String gradoText = JOptionPane.showInputDialog("Ingrese su Grado Academico: ");
        int grado = Integer.parseInt(gradoText);
        
        Docente docente = new Docente(category, grado, nombre, sueldo, num, antiguedad);
        
        docente.SueldoN(100);
        docente.ToString();
    }    
}
