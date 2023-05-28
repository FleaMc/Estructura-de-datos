/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana6ed41_actividad1;

/**
 *
 * @author lambda
 */
public class Pila {

    private Nodo tope;
     private Nodo temp;
    int contador;

    public Pila() {
        this.tope = null;
        this.contador = 0;
    }

    public boolean isEmpty() {
        if (tope == null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(String dato) {
        //if(isEmpty()){ //esta vacía
        Nodo aux = new Nodo(dato, tope);
        tope = aux;
        contador++;
//        }else{ //no está vacía
//            Nodo <E> aux = new Nodo<E>(dato, tope);
//            tope = aux;
//        }
    }

    public String pop() {
        String dato = null;
        if (!isEmpty()) {
            // no está vacío
            dato = tope.getDato();
            tope = tope.getSiguiente();
        }
        contador--;
        return dato;
    }

    public String obtener(int posicion) {
        String dato = null;
        if (posicion <= contador) {
            int limite = (contador - posicion);
            for (int j = 0; j < (limite + 1); j++) {
                dato = pop();
                //System.out.println("elemento: " + dato + ", j = " + j);
            }

        }

        return dato;
    }

    public int getContador() {
        return contador;
    }

    public String Formula(String cad) {
        String cadena = "", form="";
        int cont = 0, contLlav = 0, contCorc = 0, contParen = 0,cont2=0;
        boolean a = false,b=false;
        String dato = null;
        char llaA = '{', corA = '[', parA = '(', llaC = '}', corC = ']', parC = ')', temp;
         Nodo auxi2 = tope;
         for (int i = 0; i < cad.length(); i++) {
            temp = cad.charAt(i);
            
            if (temp == llaC && isEmpty() || temp == corC && isEmpty() || temp == parC && isEmpty()) {
                form = String.valueOf(temp);
                Nodo aux = new Nodo(form, tope);
                 tope = aux;
                cadena = "La formula introducida es incorrecta no puede empezar con llave cerrada " +aux.getDato();
                a = true;
            }                               
            if (temp == llaA || temp == corA || temp == parA || temp == corC || temp == parC || temp == llaC ) {
                cont = cont + 1;
                cont2=cont2+1;
                if (temp == llaA) {
                    contLlav = contLlav + 1;
                     form = String.valueOf(temp);
                      Nodo aux = new Nodo(form, tope);
                     tope = aux;
                }
                if (temp == corA) {
                    contCorc = contCorc + 1;
                     form = String.valueOf(temp);
                      Nodo aux = new Nodo(form, tope);
                     tope = aux;
                }
                if (temp == parA) {
                    contParen = contParen + 1;
                     form = String.valueOf(temp);
                      Nodo aux = new Nodo(form, tope);
                tope = aux;
                }
                 if (temp == llaC &&  a!=true) {
                     contLlav = contLlav - 1;
                      if(contLlav<0 || contCorc==1){
                        cadena+="Formula esta mal" +form;
                         Nodo aux = new Nodo(form, tope);
                         tope = aux;
                    }else{
                                                    
                   form = tope.getDato();
                   tope = tope.getSiguiente();  
                  
                      } 
                }
                if (temp == corC &&  a!=true) {
                     contCorc = contCorc - 1;
                    if(contCorc<0){
                         form = String.valueOf(temp);
                         Nodo aux = new Nodo(form, tope);
                         tope = aux;
                         
                         
                        
                        cadena+="Formula esta mal ";                                            
                    }else{
                    form = tope.getDato();
                   tope = tope.getSiguiente();  
                    }
                     
                }
                if (temp == parC &&  a!=true) {
                  contParen = contParen - 1;
                    if(contParen<0){
                        form = String.valueOf(temp);
                         Nodo aux = new Nodo(form, tope);
                         tope = aux;
                        cadena+="Formula esta mal" +tope.getDato();
                        
                    }else{
                    
                    form = tope.getDato();
                   tope = tope.getSiguiente();  
                    }
                }    
                               
               
            }
            
            
            
            
            if(i==cad.length()){
                b=true;
            }

        }
        if(contLlav>0){
            cadena="No cerro alguna llave";
        }
         if(contCorc>0){
            cadena="No cerro alguna llave";
        }
          if(contParen>0){
            cadena="No cerro alguna llave";
        }

       
        return cadena ;
    }

    @Override
    public String toString() {
        String cadena = "Pila{";

        if (!isEmpty()) {
            Nodo aux = tope;
            do {
                cadena += aux.getDato() + "\n";
                aux = aux.getSiguiente();
            } while (aux != null);
        }

        return cadena += '}';
    }

}
