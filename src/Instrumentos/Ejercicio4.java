package Instrumentos;

import java.lang.reflect.Array;
import java.util.Arrays;

import static Instrumentos.Instrumento.*;

public class Ejercicio4 {
    public static void main(String[] args) {

        Piano piano1 = new Piano();
        Campana campana1 = new Campana();
        llenarArrayNotas();

        piano1.interpretar();
        campana1.interpretar();

    }

}
