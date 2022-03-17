package Ejercicio1;

import static Ejercicio1.Producto.*;

public class Main {

    public static void main(String[] args) {


        Pizza pizza1 = new Pizza(Tipo.FUNGHI, Tamano.FAMILIAR);
        Pizza pizza2 = new Pizza(Tipo.CUATROQUESO, Tamano.MEDIANA);
        Pizza pizza3 = new Pizza(Tipo.MARGARITA, Tamano.MEDIANA);
        Panini panini1 = new Panini(Tipo.FUNGHI, TamanoPanini.ALMERIA, TipoPanini.SIMPLE);
        Panini panini2 = new Panini(Tipo.CUATROQUESO, TamanoPanini.SEVILLA, TipoPanini.DOBLE);

        System.out.println(pizza1.getEstado());
        servir(pizza1);
        servir(pizza2);
        System.out.println(pizza1.getEstado());

        System.out.println(Pizza.getNumeroPizzaServida());


    }
}
