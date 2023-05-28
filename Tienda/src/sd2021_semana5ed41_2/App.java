/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana5ed41_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
         Scanner leer=new Scanner(System.in);
    
         ListaDoblementeLigada <Tienda> Inventario = new ListaDoblementeLigada<Tienda>();      
         String r ="n";
        
         
         do{
              int r2=0,p=0;
           String nombre="",tipo="";
             System.out.println("--------Bienvenido---------");
             System.out.println("¿Que desea realizar?");
             System.out.println("1.-Insertar producto, 2.- Revisar inventario, 3.-Obtener por precio");
             System.out.println("4.- Buscar producto por nombre, 5.- Eliminar producto");
             r2 = leer.nextInt();
             if(r2==1){
                 System.out.println("Insertar producto");
               
                 System.out.println("Nombre producto");
                 nombre= leer.next();
                
               
                 System.out.println("Tipo");
                 tipo= leer.next();
                 System.out.println("Precio");
                 p= leer.nextInt();
                  Inventario.insert(new Tienda(nombre,tipo,p));
          
             }
             if(r2==2){
                 System.out.println("Inventario");
                 System.out.println("" + Inventario.Nombrees());
             }
             if(r2==3){
                  System.out.println("Productos por precio 0-15 ,  16-30   mayores de 50");
                  System.out.println("" + Inventario.Rangos());
             }
             if(r2==4){
                 System.out.println("Buscar productos por nombre");
                 System.out.println("Dame nombre producto");
                  nombre = leer.next();
                 System.out.println(" " +Inventario.BuscarPorNombre(nombre));
             }
             if(r2==5){
                 System.out.println("¿Que producto desea eliminar");
                 nombre= leer.next();
                 System.out.println("Eliminado" +Inventario.Eliminar(nombre));
             }
             System.out.println("Desea continuar s/n");
             r = leer.next();
         }while(r!="n");
             
             
         
         
         
      
   
  
        
    
        
    }
    
}
