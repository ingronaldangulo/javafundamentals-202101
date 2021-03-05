package pe.edu.peruano.lambda;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class LambdaConsumer {

    public static void main(String[] args) {

        Consumer<String> printConsumer = t -> System.out.println(t);
        Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
        cities.forEach(printConsumer);
    }
}
