package com.mycompany.proyecto_class.espinales;

public interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

import java.util.ArrayList;

public class ImpactoEcologicoApp {
    public static void main(String[] args) {
        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(new Edificio("Edificio A", 100, 10000));
        objetos.add(new Auto("Auto A", "Toyota", 2022, 10));
        objetos.add(new Bicicleta("Bicicleta A", "Trek", 2022));
        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.obtenerImpactoEcologico());
            System.out.println(objeto);
        }
    }
} // fin clase
