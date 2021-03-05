package pe.edu.peruano.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaFuntion {
    public static void main(String[] args) {


        System.out.println("PALABRAS");
        List<String> palabras = new ArrayList<>();
        palabras.add("ocaso");
        palabras.add("incertidumbre");
        palabras.add("viaje");


        List<String> palabras2 = Arrays.asList("ocaso","incertidumbre","veloz");
        Function<String, Integer> mapeoDeNombresFunction = String::length;
        List<Integer>  longitudes = palabras.stream().map(mapeoDeNombresFunction)
                .collect(Collectors.toList());

        System.out.println(longitudes);





    }
}
