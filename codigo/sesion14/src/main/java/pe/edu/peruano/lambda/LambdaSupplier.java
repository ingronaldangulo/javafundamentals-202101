package pe.edu.peruano.lambda;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class LambdaSupplier {

    public static void main(String[] args) {

        Supplier<Double> proveedorDouble01 = Math::random;
        DoubleSupplier proveedorDouble02 = Math::random;

        System.out.println(proveedorDouble01.get());
        System.out.println(proveedorDouble02.getAsDouble());
    }
}
