package Instrumentos;

public class Campana extends Instrumento{

    @Override
    public void interpretar() {
        for(int i=0; i<this.contarNotas;i++){

            if(notas[i] != null) {
                switch (notas[i]) {

                    case DO:
                        System.out.println("Tolon");
                        break;
                    case RE:
                        System.out.println("Tolen");
                        break;
                    case FA:
                        System.out.println("Tofan");
                        break;
                    case LA:
                        System.out.println("Tolan");
                        break;
                    case MI:
                        System.out.println("Tomin");
                        break;
                    case SI:
                        System.out.println("Tosin");
                        break;
                    case SOL:
                        System.out.println("Tosol");
                        break;

                }
            }
        }
    }
}
