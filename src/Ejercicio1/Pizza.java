package Ejercicio1;

enum Tamano{
    MEDIANA, FAMILIAR
}

public class Pizza extends Producto {

    private Tamano tamano;
    private static int numeroPizza;
    protected static int numeroPizzaServida=0;

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

    public static int getNumeroPizzaServida() {
        return numeroPizzaServida;
    }

    public static void setNumeroPizzaServida(int numeroPizzaServida) {
        Pizza.numeroPizzaServida = numeroPizzaServida;
    }
}


