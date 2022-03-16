package Ejercicio1;

import static Ejercicio1.Estado.PEDIDA;

enum Tamano{
    MEDIANA, FAMILIAR
}

public class Pizza extends Pizzeria {

    private Tamano tamano;
    private static int numeroPizza;

    public Pizza( Tipo tipo, Tamano tamano){
         super(tipo);
         this.tamano=tamano;
         numeroPizza++;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public static int getNumeroPizza() {
        return numeroPizza;
    }

    public static void setNumeroPizza(int numeroPizza) {
        Pizza.numeroPizza = numeroPizza;
    }
}


