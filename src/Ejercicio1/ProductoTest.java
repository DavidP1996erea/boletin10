package Ejercicio1;

import org.junit.jupiter.api.Test;

import static Ejercicio1.Producto.servir;
import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {

    @org.junit.jupiter.api.Test
    void servirPizzaTest() {

        Pizza pizza1 = new Pizza(Tipo.FUNGHI, Tamano.FAMILIAR);
        Pizza pizza2 = new Pizza(Tipo.FUNGHI, Tamano.MEDIANA);
        servir(pizza1);
        servir(pizza2);
        int prueba = Pizza.numeroPizzaServida;
        assertEquals(prueba, 2, "Falló");


    }

    @org.junit.jupiter.api.Test
    void servirPaniniTest() {

        Panini panini1 = new Panini(Tipo.CUATROQUESO, TamanoPanini.SEVILLA, TipoPanini.DOBLE);
        Panini panini2 = new Panini(Tipo.MARGARITA, TamanoPanini.SEVILLA, TipoPanini.SIMPLE);
        Panini panini3 = new Panini(Tipo.FUNGHI, TamanoPanini.GRANADA, TipoPanini.DOBLE);
        servir(panini1);
        servir(panini2);
        servir(panini3);
        int prueba = Panini.numeroPaniniServido;
        assertEquals(prueba, 3, "Falló");

    }

    @org.junit.jupiter.api.Test
    void setTest() {

    }

}
