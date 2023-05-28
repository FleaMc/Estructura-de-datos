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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         ListaDoblementeLigada <Pacientes> Hospital = new ListaDoblementeLigada<Pacientes>();       
         Hospital.insert(new Pacientes("Michael","Cabrera","M",12,13));
         Hospital.insert(new Pacientes("Luis","Cabrera","M",12,13));
         Hospital.insert(new Pacientes("Jose","Cabrera","M",12,15));
         Hospital.insert(new Pacientes("Antonio","Cabrera","M",12,40));
         Hospital.insert(new Pacientes("Fernanda","Cabrera","M",12,42));
         Hospital.insert(new Pacientes("Adrian","Cabrera","M",12,15));
         // a) Listar los nombres de todos los pacientes hospitalizados.
         System.out.println("" + Hospital.Nombrees());
        //  b) Obtener la cantidad de pacientes hospitalizado en las siguientes categorías: niños (0-13 años), 
        //jóvenes (13-30 años) y adultos (mayores de 30).       
       
        System.out.println("" + Hospital.Rangos());
        
       // c) Además deberá poder buscar un paciente por su nombre.
        System.out.println("Dame nombre del paciente a buscar" +Hospital.BuscarPorNombre("Michael"));
        System.out.println("Dame nombre del paciente a buscar" +Hospital.BuscarPorNombre("Leslie"));
        
    
        
    }
    
}
