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
public class Empleado extends Persona {
    private String puesto;
    private String area_trabajo;
    private int salario;
    
    public Empleado(){
        
    }

    public Empleado(String puesto, String area_trabajo, int salario, String nombre, int edad, char sexo) {
        super(nombre, edad, sexo);
        this.puesto = puesto;
        this.area_trabajo = area_trabajo;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getArea_trabajo() {
        return area_trabajo;
    }

    public void setArea_trabajo(String area_trabajo) {
        this.area_trabajo = area_trabajo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void MostrarDatos() {
        JOptionPane.showMessageDialog(null, "El nombre es: " + getNombre()
        + "\n La edad es: " + getEdad() + "\n El sexo es: " + getSexo() 
        + "\n El salario es: " + salario + "\n El puesto es: " + puesto
        + "\n El área es: " + area_trabajo);
    }
    
    
    
    
}
