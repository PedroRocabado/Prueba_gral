/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_algo;

/**
 *
 * @author pedro
 */
public class Persona {
   String apellido;
   String direccion;
   double peso;

    public Persona(String apellido, String direccion, double peso) {
        this.apellido = apellido;
        this.direccion = direccion;
        this.peso = peso;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
   
   public double metodo_peso(){  
   return peso + 20;
   } 
}
