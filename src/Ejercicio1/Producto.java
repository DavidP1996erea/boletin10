package Ejercicio1;

import static Ejercicio1.Pizza.numeroPizzaServida;
import static Ejercicio1.Panini.numeroPaniniServido;

enum Tipo{
    MARGARITA, CUATROQUESO, FUNGHI
}

enum Estado{
    PEDIDA, SERVIDA
}


public class Producto {

    public  Estado estado;

    public Producto(Tipo tipo) {

       this.estado=Estado.PEDIDA;
    }

    public static void servir(Producto producto){

        producto.setEstado(Estado.SERVIDA);

        if(producto.getClass()==Pizza.class){
            numeroPizzaServida++;

        }else if(producto.getClass()==Panini.class){
            numeroPaniniServido++;
        }

    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
