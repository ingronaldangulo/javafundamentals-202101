package pe.edu.peruano.lambda;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class LambdaSupplier {


    public static void main(String[] args) {
        Supplier<Double> doubleSupplier1 = () -> Math.random();
        DoubleSupplier doubleSupplier2 = Math::random;

        System.out.println(doubleSupplier1.get());
        System.out.println(doubleSupplier2.getAsDouble());
    }
}
