/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */
public class Proyecto_classEspinales {

    public static void main(String[] args) {
        System.out.println("proyecto de clases edificio, auto, bisicleta");
        // TODO code application logic here
    clase_edificio edificio1 = new clase_edificio("Torre Eiffel", 1000, 5000, 0.5);
    clase_auto auto1 = new clase_auto("Toyota", "Corolla", 100, 10, 2.5);
    clase_bicicleta bicicleta1 = new clase_bicicleta("Montañera", "Rojo", 50, 20, 0.1);
    System.out.println(edificio1.toString());
    System.out.println(auto1.toString());
    System.out.println(bicicleta1.toString());

    }// fin main
}// fin clase
