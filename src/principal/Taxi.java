package principal;

public class Taxi extends Coche {
    private int taximetro;
    private String color;


    public Taxi(String motor, int puertas, int ruedas, String matricula, int taximetro, String color) {
        super(motor, puertas, ruedas, matricula);
        this.taximetro = taximetro;
        this.color = color;
    }


    public int getTaximetro() {
        return taximetro;
    }

    public void setTaximetro(int taximetro) {
        this.taximetro = taximetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
