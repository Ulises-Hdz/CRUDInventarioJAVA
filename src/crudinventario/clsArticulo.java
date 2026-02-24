/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crudinventario;

/**
 *
 * @author dogza
 */
public class clsArticulo {
    
    // Atributos 
    private String codigo;
    private String descripcion;
    private Double precio;
    
    public clsArticulo(String codigo , String descripcion, Double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    //Im
    public String aTexto(){
        String articulo = this.codigo + "|" + this.descripcion + "|" + this.precio;
        System.out.print(articulo);
        return articulo;
    }
    
    public void Guardar() {
        System.err.println(this.aTexto());
    }
}
