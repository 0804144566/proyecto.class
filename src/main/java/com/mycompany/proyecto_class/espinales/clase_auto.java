package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */
public class clase_auto {
    public static void main(String[] args) {
        System.out.println("proyecto de clases auto");
        public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private double consumoDeCombustible;

    public Auto(String marca, String modelo, int año, double consumoDeCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.consumoDeCombustible = consumoDeCombustible;
    }
//contructor 
        public Auto(String marca, String modelo, int año) {
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
    }

    public double getConsumoDeCombustible() {
        return consumoDeCombustible;
    }

    public void setConsumoDeCombustible(double consumoDeCombustible) {
        this.consumoDeCombustible = consumoDeCombustible;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", consumoDeCombustible=" + consumoDeCombustible +
                '}';
    }
    }//fin main
    }// fin clase