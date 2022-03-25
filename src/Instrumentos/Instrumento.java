package Instrumentos;

import java.util.Random;
import java.util.Scanner;

enum Notas{
    DO, RE, MI, FA, SOL, LA , SI
}

public abstract class Instrumento {
    protected static final int MAX_NOTAS=100;
    protected static Notas[] notas = new Notas[MAX_NOTAS];
    protected static int contarNotas;


    public Instrumento(){

    }
    public static void add(Notas notasMusicales){

        if(contarNotas<MAX_NOTAS){
            notas[contarNotas]=notasMusicales;
            contarNotas++;
        }else {
            System.out.println("No se puede introducir más notas");
        }

    }

    public static void llenarArrayNotas(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca cuantas notas desea introducir");
        int numNotas=sc.nextInt();

        while (numNotas>0){
            add(Notas.values()[new Random().nextInt(Notas.values().length)]);
            numNotas--;
        }

    }

    public abstract void interpretar();


}
