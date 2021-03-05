package pe.edu.peruano.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestLambda {

    public static void main(String[] args) {

        String [] nombres = new String[]{"pedro", "alex", "oscar", "ana", "maria"};
        for (String nombre: nombres) {
            System.out.println(nombre);
        }

        System.out.println("ARRAYS--------------------");
        Arrays.stream(nombres).forEach(System.out::println);

        System.out.println("ARRAYS con ARGSs--------------------");
        imprimir("pedro", "oscar");
        System.out.println("-----------");
        imprimir("pedro", "david", "oscar", "alex");

        System.out.println("ARRAYS con colecciones--------------------");
        List<Integer> numeros = new ArrayList<>();
        for (int i=0;i<20;i++){
            numeros.add(i*10);
        }

        numeros.stream().filter(ns -> ns>60 ).forEach(System.out::println);

        System.out.println("PALABRAS");
        List<String> palabras = new ArrayList<>();
        palabras.add("ocaso");
        palabras.add("incertidumbre");
        palabras.add("viaje");

        palabras.stream().filter(palabra->palabra.contains("e")).forEach(System.out::println);






    }

    public static void imprimir(String ... nombres){
        Arrays.stream(nombres).forEach(System.out::println);
    }
}
