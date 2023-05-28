/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana6ed41_actividad1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 *
 * @author lambda
 */
public class LeerTeclado {
/**
 *
 * @author lambda
 */
    public static String leerCadena() throws Exception{
          InputStreamReader isr = new InputStreamReader(System.in); //System.in hace referencia al teclado
        BufferedReader bis = new BufferedReader(isr);

           String cadena ="";
           cadena = bis.readLine();
           return cadena;
        
    }
    public static float leerFloat() throws Exception{
          InputStreamReader isr = new InputStreamReader(System.in); //System.in hace referencia al teclado
        BufferedReader bis = new BufferedReader(isr);

           Float numero = 0f;
           numero = Float.parseFloat(bis.readLine());
           return numero;
        
    }
    public static int leerInt() throws Exception{
          InputStreamReader isr = new InputStreamReader(System.in); //System.in hace referencia al teclado
        BufferedReader bis = new BufferedReader(isr);

           int numero = 0;
           numero = Integer.parseInt(bis.readLine());
           return numero;
        
    }
}

