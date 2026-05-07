/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author dogza
 */
public class clsCSV {
        //Atributo
    String archivo = "inventario.csv";
    String archivoCliente = "clientes.csv";
    
    //Metodo de Articulos
    public void importarDatos(){
        try(BufferedReader br = new BufferedReader( new FileReader(archivo))){
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                // Asigancion de valores para importar datos
                clsArticulo cArticulo = new clsArticulo(
                datos[0] , datos[1] , Double.parseDouble(datos[2]));
                // Almacena en archivo txt
                cArticulo.guardar();
                
            }
            br.close();
            System.out.println("Se ha terminado con la importacion");
        }catch(IOException e){
            System.out.println("Mensaje de error" + e.getMessage());
        }
    }
    
    public void importarClientes(){
        try(BufferedReader br = new BufferedReader( new FileReader(archivoCliente))){
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                // Asigancion de valores para importar datos
                clsCliente cCliente = new clsCliente(
                Integer.parseInt(datos[0]) , datos[1] , datos[2], datos[3]);
                // Almacena en archivo txt
                cCliente.guardar();
                
            }
            br.close();
            System.out.println("Se ha terminado con la importacion");
        }catch(IOException e){
            System.out.println("Mensaje de error" + e.getMessage());
        }
    }
}
