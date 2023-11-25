
package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */
public class clase_bisicleta {
    public static void main(String[] args) {
        System.out.println("bienvenidos a la clase bisicleta");
        
       public class Bicicleta {
    private String marca;
    private String modelo;
    private int año;

    // contructor
    public Bicicleta(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
        
    }//fin main
}//fin clase
