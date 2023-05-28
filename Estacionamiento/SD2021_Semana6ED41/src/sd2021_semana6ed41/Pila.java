/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana6ed41;

/**
 *
 * @author lambda
 */
public class Pila<E> {

    private Nodo<E> tope;
    private Nodo<E> temp;
   

    public Pila() {
        this.tope = null;
    }

    public boolean isEmpty() {
        if (tope == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(E dato) {
        //if(isEmpty()){ //esta vacía
        Nodo<E> aux = new Nodo<E>(dato, tope);
        
        tope = aux;
        
       
        
        
//        }else{ //no está vacía
//            Nodo <E> aux = new Nodo<E>(dato, tope);
//            tope = aux;
//        }
    }
   

    public E pop() {
        E dato = null;
        if (!isEmpty()) {
            // no está vacío
            dato = tope.getDato();
            tope = tope.getSiguiente();
        }
        return dato;
    }

    @Override
    public String toString() {
        String cadena = "Pila{";
      
        if (!isEmpty()) {
            Nodo <E> aux = tope;
            do {
         
               cadena += aux.getDato() +"\n" ; 
            
   
               aux = aux.getSiguiente();
            
               
               } while (aux != null);  
        }

        return cadena += '}';
        
    }
    


     public String Cupo() {
        String cadena = "Pila{";
        
        int i = 0;
        
        if (!isEmpty()) {
            Nodo <E> aux = tope;
           
            do {                 
             if (aux!=null) {              
                i=i+1;              
             }        
            
             aux=aux.getSiguiente();          
           
             
               
              
               
               } while (aux != null);
                 aux = tope;            
                do{
                       if(i==6){
                           i=0;
                     cadena +=  "Cupo Lleno" +  "\n" ;        
                   aux=aux.getSiguiente();  
                       }
                
                   cadena += aux.getDato() +"\n" ;    
                   aux=aux.getSiguiente(); 
    
                 
                }while(aux!=null);                       
                  
        }

        return cadena += '}';
    }
      public E reinsertar(int limite){
       
        E dato = null;
        int e = 0;
      
        Nodo <E> aux2 = temp;
        String cadena="{";
         do {
             e=e+1;
                     
             System.out.println(cadena += aux2.getDato()+"..") ;
             tope = aux2;
               aux2 = aux2.getSiguiente();
               
            
             
               } while (e<limite);  
           
    
            return dato;
        }
   
    public String RemoverAuto2(E auto,E nuevo) {
       int iTest = 0; 
       E dato = null;
          int limite=0;
        String cadena="{";
        int i = 0;
        int j=0,e=0;
        boolean a = false;
       
          Nodo <E> aux = tope;
        
        if (!isEmpty()) {
            // no está vacío   
           
           
         do{
              
              i=i+1;
          if(j!=i-1 && a!=true){
               Nodo<E> aux2 = new Nodo<E>(dato, tope);
        
                     temp = aux2;
        
            
                 aux2 = aux2.getSiguiente();
                 System.out.println(temp.getDato());
               
          }
            
              
                         
           if (auto.equals(aux.getDato())) { 
             
               do {
                   j=j+1;
                          
                
                   tope = tope.getSiguiente(); 
                   
                   if(i==j){
                       
                             Nodo<E> auxi = new Nodo<E>(nuevo, tope);                          
                            tope = auxi;                           
                            limite=j;
                            a = true;
                      
                            
                   }
                                   
               }while(j!=i);  
               
                
           }
           
               
      
               aux=aux.getSiguiente();
              
                                             
         }while(aux!=null);
           
        cadena="Saque " +limite +" autos";
          
     
        
        
        }            
        
       
        return cadena ;       
    } 
     
     
   

  
        
        
        
     
        
    }
      
    
    
   
     
     
  
      
     
   
     
     
     
     
    
     
   



    
   
   
         
      
        
        
    
