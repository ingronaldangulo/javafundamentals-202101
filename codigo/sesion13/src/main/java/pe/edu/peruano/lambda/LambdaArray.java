package pe.edu.peruano.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaArray {

    public static void main(String[] args) {


        String [] nombres= new String[] { "pedro", "angel", "oscar","ana","maria"};

        for (String nombre:nombres) {
            System.out.println(nombre);
        }

        System.out.println("--Arrays------------");
        Arrays.stream(nombres).forEach(System.out::println);

        System.out.println("--Arrays filter------------");
        Arrays.stream(nombres).filter(n->n.length()<4).forEach(System.out::println);


        System.out.println("--Arrays ARGS------------");
        imprimir ("pedro","oscar","david");
        imprimir ("gema","ana","maria");

        System.out.println("--Arrays Colecciones------------");

        List<Integer> numbers = new ArrayList<>();
        for (int i= 0;i<10;i++){
            numbers.add(i*10);
        }


        numbers.stream().filter(n->n>50).forEach(System.out::println);


    }


    public static void imprimir (String ... nombres) {
        Arrays.stream(nombres).forEach(System.out::println);
    }
}
