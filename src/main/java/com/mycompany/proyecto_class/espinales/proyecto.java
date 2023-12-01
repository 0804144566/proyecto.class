/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_class.espinales;

/**
 *
 * @author paul2
 */
package com.mycompany.proyecto_class.espinales;

import java.util.ArrayList;

public interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

import java.util.ArrayList;

public class ImpactoEcologicoApp {
    public static void main(String[] args) {
        System.out.println("Impacto ecologico");
    }

    ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
    objetos.add(new Edificio("Edificio A", 100, 10000));
    objetos.add(new Auto("Auto A", "Toyota", 2022, 10));
    objetos.add(new Bicicleta("Bicicleta A", "Trek", 2022));
    for (ImpactoEcologico objeto : objetos) {
        System.out.println(objeto.obtenerImpactoEcologico());
        System.out.println(objeto);
    }
}

