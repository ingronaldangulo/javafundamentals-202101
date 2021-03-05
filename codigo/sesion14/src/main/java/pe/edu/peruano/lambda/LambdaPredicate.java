package pe.edu.peruano.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaPredicate {

    public static void main(String[] args) {

        List<String> palabras = new ArrayList<>();
        palabras.add("ocaso");
        palabras.add("incertidumbre");
        palabras.add("viaje");

        // predicate: palabra->palabra.contains("e")
        palabras.stream().filter(palabra->palabra.contains("e")).forEach(System.out::println);


    }
}
