/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctica.github;

import javax.swing.JOptionPane;

/**
 *
 * @author jfeli
 */
public class PrincipalEmpleado {
    public static void main(String[] args) {
        Empleado datos = new Empleado();
        datos.setNombre(JOptionPane.showInputDialog("Nombre del empleado"));
        datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad del empleado")));
        datos.setSexo(JOptionPane.showInputDialog(" Género del empleado M o F").charAt(0));
        datos.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Salario del empleado")));
        datos.setPuesto(JOptionPane.showInputDialog("Puesto del empleado"));
        datos.setArea_trabajo(JOptionPane.showInputDialog("Área de trabajo del empleado"));
        datos.MostrarDatos();
        
    }
    
}
