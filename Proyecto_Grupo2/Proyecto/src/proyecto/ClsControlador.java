/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClsControlador {
     public void crearFichero(String nombreFichero){
        
         ObjectOutputStream oos;
        try{
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            oos.close();
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    
    }
    
    public void escribirObjeto(String nombreFichero, ArrayList<Object> elementos){
        System.out.println("llega");
        
        try{
            ObjectOutputStream oos;
            oos = new ObjectOutputStream(new FileOutputStream(nombreFichero));
            for(int i = 0; i < elementos.size() ; i++){
                Object elemento = new Object();
                elemento = elementos.get(i);
                oos.writeObject(elemento);
                System.out.println(elemento.toString());
            }
            oos.close();
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex);
        }
    
    }
    
    public ArrayList<Object> extraerObjetos(String nombreFichero){
        ArrayList<Object> elementos = new ArrayList<>();
        
        try{
            //va estar leyendo los datos de entrada
            //flujo de entrada de objetos
            ObjectInputStream ois;
            //para leer de la lista de archivo FIle Inpunt stream
            //sacar del archivo un aoupput 
            //ingresar al archivo input
            
            ois = new ObjectInputStream(new FileInputStream(nombreFichero));
            
            Object aux = ois.readObject();
            while(aux!= null){
                elementos.add(aux);
                aux = ois.readObject();
            }
            ois.close();
        
        }catch(FileNotFoundException ex){
            System.out.println("El fichero no existe, lo voy a crear.");
            crearFichero(nombreFichero);
        }catch (EOFException e1)
        {
            //System.out.println ("Fin de fichero");
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        return elementos;
    }
}
