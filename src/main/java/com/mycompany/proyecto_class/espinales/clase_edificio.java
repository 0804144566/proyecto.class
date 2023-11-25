
package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */

        public class Edificio {
            public static void main(String[] args) {
        System.out.println("bienvenidos a la clase edificio");
        
    private String nombre;
    private int numeroDeEmpleados;
    private double consumoDeEnergia;

    //contructor
    public Edificio(String nombre, int numeroDeEmpleados, double consumoDeEnergia) {
        this.nombre = nombre;
        this.numeroDeEmpleados = numeroDeEmpleados;
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }

    public void setNumeroDeEmpleados(int numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    public double getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(double consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    @Override
    public String toString() {
        return "Edificio{" +
                "nombre='" + nombre + '\'' +
                ", numeroDeEmpleados=" + numeroDeEmpleados +
                ", consumoDeEnergia=" + consumoDeEnergia +
                '}';
    }//fin main
}// fin clase
