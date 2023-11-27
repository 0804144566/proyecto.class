
package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */

        public class Edificio {
            public static void main(String[] args) {
        System.out.println("bienvenidos a la clase edificio");
        
public class Edificio implements ImpactoEcologico {
    
}
    // Atributos
    private String nombre; // Nombre del edificio
    private double area; // Área construida en m2
    private double consumo; // Consumo de electricidad en kWh
    private double factor; // Factor de emisión de electricidad en kgCO2e/kWh
    // Constructor
    public Edificio(String nombre, double area, double consumo, double factor) {
        this.nombre = nombre;
        this.area = area;
        this.consumo = consumo;
        this.factor = factor;
        
    }
    // Métodos
    // Método para obtener el nombre del edificio
    public String getNombre() {
        return nombre;
    }
    // Método para obtener el área del edificio
    public double getArea() {
        return area;
    }
    // Método para obtener el consumo de electricidad del edificio
    public double getConsumo() {
        return consumo;
    }
    // Método para obtener el factor de emisión de electricidad del edificio
    public double getFactor() {
        return factor;
    }
    // Método para obtener el impacto ecológico del carbono del edificio
    @Override
    public double obtenerImpactoEcologico() {
        // El impacto ecológico del carbono se calcula multiplicando el consumo de electricidad por el factor de emisión
        // y dividiendo por 1000 para obtener el resultado en tCO2e
        return (consumo * factor) / 1000;
    }
    // Método para mostrar la información del edificio
    @Override
    public String toString() {
        return "Edificio: " + nombre + "\n" +
               "Área: " + area + " m2\n" +
               "Consumo: " + consumo + " kWh\n" +
               "Factor: " + factor + " kgCO2e/kWh\n";
    }
} // fin clase