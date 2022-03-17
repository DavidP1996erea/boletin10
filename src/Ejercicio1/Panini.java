package Ejercicio1;

enum TamanoPanini{
    ALMERIA, GRANADA, SEVILLA
}

enum TipoPanini{
    SIMPLE, DOBLE
}

public class Panini extends Producto{

    private TamanoPanini tamanoPanini;
    private TipoPanini tipoPanini;
    private static int numeroPaniniPedido=0;

    public Panini(Tipo tipo, TamanoPanini tamanoPanini, TipoPanini tipoPanini){

        super(tipo);
        this.tamanoPanini=tamanoPanini;
        this.tipoPanini=tipoPanini;
        numeroPaniniPedido++;
    }

}
