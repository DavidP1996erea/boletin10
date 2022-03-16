package Ejercicio1;

enum Tipo{
    MARGARITA, CUATROQUESO, FUNGHI
}

enum Estado{
    PEDIDA, SERVIDA
}


public class Pizzeria {

    public  Estado estado;

    public Pizzeria(Tipo tipo) {

       this.estado=Estado.PEDIDA;
    }

    public static void servir(Pizzeria producto){

        producto.setEstado(Estado.SERVIDA);
        System.out.println(producto.getEstado());

    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
