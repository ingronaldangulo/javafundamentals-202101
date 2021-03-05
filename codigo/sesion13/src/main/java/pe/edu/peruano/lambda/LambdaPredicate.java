package pe.edu.peruano.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicate {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
        Predicate<String> nameStartsWithS = str -> str.startsWith("S");
        names.stream().filter(nameStartsWithS).forEach(System.out::println);
    }

}
