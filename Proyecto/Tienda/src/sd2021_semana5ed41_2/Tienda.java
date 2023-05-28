/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana5ed41_2;

import java.util.Objects;

/**
 *
 * @author Michael
 */
public class Tienda {
    //nombres, apellidos, cédula, edad, género
    private String nombre, apellido;
    private int edad;

    public Tienda(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
      
      
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }


  

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


 

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tienda other = (Tienda) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventario{" + "nombre=" + nombre + ", tipo=" + apellido + ", precio=" + edad + '}';
    }
    
    
    
    
}
