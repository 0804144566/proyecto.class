
package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */
public class clase_bisicleta {
    public static void main(String[] args) {
        System.out.println("bienvenidos a la clase bisicleta");
  public class Bicicleta implements ImpactoEcologico {
      
  }
    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private double distancia;
    private double calorias;
    private double factor;
    // Constructor
    public Bicicleta(String marca, String modelo, int año, double distancia, double calorias, double factor) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.distancia = distancia;
        this.calorias = calorias;
        this.factor = factor;
    }
    
    // Métodos
    // Método para obtener la marca de la bicicleta
    public String getMarca() {
        return marca;
    }
    // Método para obtener el modelo de la bicicleta
    public String getModelo() {
        return modelo;
    }
    // Método para obtener el año de la bicicleta
    public int getAño() {
        return año;
    }
    // Método para obtener la distancia recorrida por la bicicleta
    public double getDistancia() {
        return distancia;
    }
    // Método para obtener las calorías quemadas por la bicicleta
    public double getCalorias() {
        return calorias;
    }
    // Método para obtener el factor de emisión de la bicicleta
    public double getFactor() {
        return factor;
    }
    // Método para obtener el impacto ecológico del carbono de la bicicleta
    @Override
    public double obtenerImpactoEcologico() {
        // El impacto ecológico del carbono se calcula multiplicando la distancia recorrida por el factor de emisión
        // y dividiendo por 100 para obtener el resultado en tCO2e
        return (distancia * factor) / 100;
    }
    // Método para mostrar la información de la bicicleta
    @Override
    public String toString() {
        return "Bicicleta: " + marca + " " + modelo + "\n" +
               "Año: " + año + "\n" +
               "Distancia: " + distancia + " km\n" +
               "Calorías: " + calorias + " kcal\n" +
               "Factor: " + factor + " kgCO2e/kcal\n";
    }
}// fin de clase
