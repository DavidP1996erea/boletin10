package Ejercicio1;

import static Ejercicio1.Pizzeria.*;

public class Main {

    public static void main(String[] args) {


        Pizza pizza1 = new Pizza(Tipo.FUNGHI, Tamano.FAMILIAR);

        System.out.println(pizza1.getEstado());
        servir(pizza1);



    }
}
