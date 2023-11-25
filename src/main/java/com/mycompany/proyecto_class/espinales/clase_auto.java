package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */
public class clase_auto {
    public static void main(String[] args) {
        System.out.println("proyecto de clases auto");
        // Constructor
public Auto(String marca, String modelo, double distancia, double consumo, double factor) {
    this.marca = marca;
    this.modelo = modelo;
    this.distancia = distancia;
    this.consumo = consumo;
    this.factor = factor;
}

// Métodos
// Método para obtener la marca del auto
public String getMarca() {
    return marca;
}

// Método para obtener el modelo del auto
public String getModelo() {
    return modelo;
}

// Método para obtener la distancia recorrida por el auto
public double getDistancia() {
    return distancia;
}

// Método para obtener el consumo de combustible del auto
public double getConsumo() {
    return consumo;
}

// Método para obtener el factor de emisión de combustible del auto
public double getFactor() {
    return factor;
}

// Método para obtener el impacto ecológico del carbono del auto
@Override
public double obtenerImpactoEcologico() {
    // El impacto ecológico del carbono se calcula multiplicando la distancia recorrida por el consumo de combustible
    // por el factor de emisión y dividiendo por 100 para obtener el resultado en tCO2e
    return (distancia * consumo * factor) / 100;
}

// Método para mostrar la información del auto
@Override
public String toString() {
    return "Auto: " + marca + " " + modelo + "\n" +
           "Distancia: " + distancia + " km\n" +
           "Consumo: " + consumo + " L/100km\n" +
           "Factor: " + factor + " kgCO2e/L\n";
}
    }// fin main
}// fin clase    