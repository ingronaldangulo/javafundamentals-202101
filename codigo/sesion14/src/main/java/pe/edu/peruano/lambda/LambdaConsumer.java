package pe.edu.peruano.lambda;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaConsumer {

    public static void main(String[] args) {

        Consumer<String> printConsumer = consumer -> System.out.println("---" + consumer);
        Stream<String> ciudades = Stream.of("Sydney", "Londres", "Nueva York");
        ciudades.forEach(printConsumer);


    }
}
