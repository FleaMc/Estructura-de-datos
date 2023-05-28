/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd2021_semana5ed41_2;

/**
 *
 * @author lambda
 */
public class ListaDoblementeLigada<E extends Tienda> {

    private Nodo<E> ultimo_nodo;
    private Nodo<E> primer_nodo;

    public ListaDoblementeLigada() {
        this.ultimo_nodo = null;
        this.primer_nodo = null;
    }

    public boolean isEmpty() {
        if (ultimo_nodo == null) { //esta vacia
            return true;
        } else { //no está vacía
            return false;
        }
    }
   

    public void insert(E dato) {
        if (isEmpty()) { // esta vacía
            Nodo<E> auxiliar = new Nodo<E>(dato, null, null);
            ultimo_nodo = auxiliar;
            primer_nodo = auxiliar;
        } else { //no esta vacia
            Nodo<E> auxiliar = new Nodo<E>(dato, ultimo_nodo, null);
            ultimo_nodo.setAnterior(auxiliar);
            ultimo_nodo = auxiliar;

        }
    }
    
   
    
    
    
    
    
    public E eliminar(E dato){
        E dato_eliminado =null;
        if(!isEmpty()){
            Nodo<E> aux=ultimo_nodo;
            boolean encontrado=false;
            while(aux != null && !encontrado){
                encontrado = (aux.getDato().equals(dato));
                if(!encontrado){
                    aux= aux.getSiguiente();
                }
                dato_eliminado=aux.getDato();
            }
            if(encontrado){
                if(aux.equals(ultimo_nodo)){
                    ultimo_nodo = aux.getSiguiente();
                }else{
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    if(aux.getSiguiente() != null){
                        aux.getSiguiente().setAnterior(aux.getAnterior());
                    }
                }
                aux=null;
            }
            
        }
        return dato_eliminado;
    }
    

    public String imprimirUltimoPrimero() {
        String cadena = "Ultimo{";

        if (!isEmpty()) {
            // no está vacía  (aquí si hacemos algo)
            Nodo<E> aux = ultimo_nodo;
            do {
                cadena += aux.getDato().toString() + ",";
                aux = aux.getSiguiente();

            } while (aux != null);
        }
        return cadena + "}Primero";
    }
    
    public String Nombres() {
        String cadena = "Nombres{";
        int i = 0;
        if (!isEmpty()) {
            // no está vacía  (aquí si hacemos algo)
            
            Nodo<E> aux = ultimo_nodo;
            do { 
                
                
                cadena += aux.getDato().toString() + ",";
                aux = aux.getSiguiente();

            } while (aux != null);
        }
        return cadena + "}";
    }

    public String imprimirPrimeroUltimo() {
        String cadena = "Primero{";
        if (!isEmpty()) {
            // no está vacía  (aquí si hacemos algo)
            Nodo<E> aux = primer_nodo;
            do {
                cadena += aux.getDato().toString()+ ",";
                aux = aux.getAnterior();

            } while (aux != null);
        }
        return cadena + "}Ultimo";
    }

    @Override
    public String toString() {
       return imprimirUltimoPrimero();
    }
    
    public String Nombrees(){
        String cadena = "Productos{";
        
       
        if (!isEmpty()) {
            // no está vacía  (aquí si hacemos algo)
            Nodo<E> aux = primer_nodo;
            do {
                cadena += aux.getDato().toString()+ ",";
                         aux = aux.getAnterior();     
                
          

            } while (aux != null);
        }
    
        
        return cadena += "}";
        
    }
    // b) Obtener la cantidad de pacientes hospitalizado en 
    //las siguientes categorías: niños (0-13 años), jóvenes (13-30 años) y adultos (mayores de 30).
  
     
      public String Rangos(){
        
        String nin = "",ado="",adult="";
        String cadena = "Productos{";
          
        if (!isEmpty()) {
            // no está vacía  (aquí si hacemos algo)
            Nodo<E> aux = primer_nodo;
           
            do {
                
                
                if (aux.getDato().getEdad()<16 && aux.getDato().getEdad()>0)
                {
                nin += "*";
              
                }
                else if (aux.getDato().getEdad()<31 && aux.getDato().getEdad()>15) {
                        
                         ado += "*";
                        
                        }
                  else if (aux.getDato().getEdad()>50) {
                        
                         adult += "*"; 
                        
                        }
                         aux = aux.getAnterior();     
                
          

            } while (aux != null);
        }
    
        
        return cadena += ": "+ "\n"+ "0-15 : "+ nin + "\n"+ "16-30: " + ado + "\n" + ">50: " +adult+ "}";
        
    }
   
        
  
   
     public String BuscarPorNombre(String nombre){
        
        
        String cadena = "{";
        int enc = 0;
        if (!isEmpty()) {
            // no está vacía  (aquí si hacemos algo)
            Nodo<E> aux = primer_nodo;
           
            do {
                if (nombre.equals(aux.getDato().getNombre()))
                {
                cadena += "Producto encontrado " + aux.getDato();
                enc = 1;
              }
    aux = aux.getAnterior();     
                
          

            } while (aux != null);   
           if(enc==0){
               cadena = "(Prodcuto no encontrado: " +nombre;
           }
    }

  return cadena += "}";
   } 
     
       public String Eliminar(String nombre){
        E dato_eliminado =null;
        if(!isEmpty()){
            Nodo<E> aux=ultimo_nodo;
            boolean encontrado=false;
            while(aux != null && !encontrado){
                encontrado = (aux.getDato().getNombre()
                        .equals(nombre));
                if(!encontrado){
                    aux= aux.getSiguiente();
                }
                dato_eliminado=aux.getDato();
            }
            if(encontrado){
                if(aux.equals(ultimo_nodo)){
                    ultimo_nodo = aux.getSiguiente();
                }else{
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    if(aux.getSiguiente() != null){
                        aux.getSiguiente().setAnterior(aux.getAnterior());
                    }
                }
                aux=null;
            }
            
        }
        return nombre;
    }
}