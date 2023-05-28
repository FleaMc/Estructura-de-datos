/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana6ed41_actividad1;

import java.util.Scanner;

/**
 *
 * @author lambda
 */
public class App { //Principal

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner cad = new Scanner(System.in);
        String form="";
        Pila pila = new Pila ();
        
      
      
        System.out.println("Dame formula");
        form = cad.next();
         
        System.out.println(pila.Formula(form));
        
        System.out.println(pila);
     
      
        
    }
}
