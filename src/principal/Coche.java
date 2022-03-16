package principal;

public class Coche {
    private String motor;
    private int puertas;
    private int ruedas;
    private String matricula;

    public Coche(){

    }

    public Coche(String motor, int puertas, int ruedas, String matricula) {
        this.motor = motor;
        this.puertas = puertas;
        this.ruedas = ruedas;
        this.matricula = matricula;
    }

    protected void mostrarMatricula(){
        System.out.println(getMatricula());
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
