/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana6ed41;

import java.util.Scanner;



/**
 *
 * @author lambda
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila <Integer> carros = new Pila<Integer>();
        int limite=0;
        //FILO First input, Last Output
        Scanner leer=new Scanner(System.in); 
        carros.push(1);  //primer elemento en entrar , ultimo elemento en salir    
        carros.push(2);     
        carros.push(3);
        carros.push(4); // ultimo elemento en entrar , el primer elemento en salir
        carros.push(5);
        System.out.println("Dame hasta donde sacar");
        limite=leer.nextInt();
      
        
        
    
   
        System.out.println("");
       System.out.println("Remover auto" +carros.RemoverAuto2(limite,8));
        
        System.out.println(carros);
        System.out.println("Reinsertar" +carros.reinsertar(limite-1));
        System.out.println(carros);
       
        
    }
    
}
