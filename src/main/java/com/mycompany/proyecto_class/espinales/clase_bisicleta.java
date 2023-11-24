/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */
public class clase_bisicleta {
    public static void main(String[] args) {
        System.out.println("bienvenidos a la clase bisicleta");
       
        // Constructor
public Bicicleta(String tipo, String color, double distancia, double calorias, double factor) {
    this.tipo = tipo;
    this.color = color;
    this.distancia = distancia;
    this.calorias = calorias;
    this.factor = factor;
}

// Métodos
// Método para obtener el tipo de bicicleta
public String getTipo() {
    return tipo;
}

// Método para obtener el color de bicicleta
public String getColor() {
    return color;
}

// Método para obtener la distancia recorrida por la bicicleta
public double getDistancia() {
    return distancia;
}

// Método para obtener las calorías quemadas por la bicicleta
public double getCalorias() {
    return calorias;
}

// Método para obtener el factor de emisión de calorías de la bicicleta
public double getFactor() {
    return factor;
}

// Método para obtener el impacto ecológico del carbono de la bicicleta
@Override
public double obtenerImpactoEcologico() {
    // El impacto ecológico del carbono se calcula multiplicando las calorías quemadas por la distancia recorrida
    // por el factor de emisión y dividiendo por 1000 para obtener el resultado en tCO2e
    return (calorias * distancia * factor) / 1000;
}

// Método para mostrar la información de la bicicleta
@Override
public String toString() {
    return "Bicicleta: " + tipo + "\n" +
           "Color: " + color + "\n" +
           "Distancia: " + distancia + " km\n" +
           "Calorías: " + calorias + " cal/km\n" +
           "Factor: " + factor + " kgCO2e/cal\n";
}

// Método para cambiar el tipo de bicicleta
public void setTipo(String nuevoTipo) {
    // Se asigna el nuevo tipo al campo tipo
    tipo = nuevoTipo;
}

// Método para cambiar el color de bicicleta
public void setColor(String nuevoColor) {
    // Se asigna el nuevo color al campo color
    color = nuevoColor;
}

// Método para aumentar la distancia recorrida por la bicicleta
public void aumentarDistancia(double incremento) {
    // Se suma el incremento al campo distancia
    distancia += incremento;
}

// Método para reducir la distancia recorrida por la bicicleta
public void reducirDistancia(double decremento) {
    // Se resta el decremento al campo distancia
    distancia -= decremento;
}

// Método para cambiar las calorías quemadas por la bicicleta
public void setCalorias(double nuevasCalorias) {
    // Se asignan las nuevas calorías al campo calorias
    calorias = nuevasCalorias;
}

// Método para cambiar el factor de emisión de calorías de la bicicleta
public void setFactor(double nuevoFactor) {
    // Se asigna el nuevo factor al campo factor
    factor = nuevoFactor;
}
        
    }//fin main
}//fin clase
