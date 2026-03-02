package crudinventario;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dogza
 */
public class mArticulo {
    
    public void insertar(String cadenaArticulo){
        
        try {
            // Esta linea crea el archivo donde se guarda la informacion
            FileWriter archivo = new FileWriter("listado_articulos.txt" , true);
            // Buffer temporal que se encarga de guardar los datos en el archivo
            BufferedWriter buffer = new BufferedWriter(archivo);
            
            // Escribe en el archivo de texto
            buffer.write(cadenaArticulo); 
            // Agrega un salto de linea al registro
            buffer.newLine(); 
            // Guarda los registros en el archivo
            buffer.close();

        } catch (IOException e) {
            //lblSaludo.setText("Error al guardar el archivo: " + e.getMessage());
        }
    }
    
    public void consultar(){
        // Variable donde se guardan los archivos
        ArrayList<String> listaRegistros = new ArrayList<>();
        
        //Este codigo lee el archivo completo para usarlo
        try(BufferedReader br = new BufferedReader( new FileReader("listado_articulos.txt"))) {
            // Recorrido de registros en el archivo
            String linea;
            while((linea = br.readLine()) != null) {
                // Separa el dato guardo por un caracter especial
                String[] datos = linea.split("|");
                String datoBonito = "Codigo: " + datos[0] + " Descripcion: " + datos[1] + " Precio: " + datos[2];
                listaRegistros.add(datoBonito);
            }
        } catch (IOException e) {
            // Muestra los errores que puediera tener
            System.out.println("Mensaje de error" + e.getMessage());
            listaRegistros.add("Error al cargar los datos");
        }
        System.out.println(listaRegistros);
        
    }
    
}
