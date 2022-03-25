package Instrumentos;

public class Piano  extends Instrumento{




    @Override
    public void interpretar() {

        for(int i=0; i<this.contarNotas;i++){

            if(notas[i] != null) {
                switch (notas[i]) {

                    case DO:
                        System.out.println("Podon");
                        break;
                    case RE:
                        System.out.println("Poren");
                        break;
                    case FA:
                        System.out.println("Pofan");
                        break;
                    case LA:
                        System.out.println("Polan");
                        break;
                    case MI:
                        System.out.println("Pomin");
                        break;
                    case SI:
                        System.out.println("Posin");
                        break;
                    case SOL:
                        System.out.println("Posol");
                        break;

                }
            }
        }
    }
}
