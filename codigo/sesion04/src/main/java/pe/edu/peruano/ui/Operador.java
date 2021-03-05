package pe.edu.peruano.ui;

public class Operador {

    public static void main(String[] argumentos){

        //Operadores Aritmeticos
        int precio1 = 10;
        double precio2 = 5.78;

        double multiplicacion = precio1 * precio2;
        System.out.println("Multplicacion: " + multiplicacion);

        double suma = precio1 + precio2;
        System.out.println("Suma: " + suma);

        //paso 1
        precio1 = 124;
        precio2 = 10.0;

        double modulo = precio1 % precio2;
        System.out.println("Modulo: " + modulo);

        //paso2
        precio1 = precio1/10;
        precio2 = 10.0;

        modulo = precio1 % precio2;
        System.out.println("Modulo: " + modulo);

        //raiz cuadrada
        double raiz = Math.sqrt(25);
        System.out.println("Raiz cuadrada: " + raiz);

        //Potencia
        double potencia = Math.pow(2, 3);
        System.out.println("Potencia: " + potencia);

        //paso3
        precio1 = precio1/10;
        precio2 = 10.0;

        modulo = precio1 % precio2;
        System.out.println("Modulo: " + modulo);


        //Operadores Logicos
        // and , or, equals
        precio1 = 200;
        precio2 = -10;

        System.out.println("Precio 1: " + precio1);
        System.out.println("Precio 2: " + precio2);

        boolean resultado = precio1 > precio2 && precio2 < 0; //true o false
        System.out.println("Resultado AND: " + resultado);

        precio2 = 500;
        System.out.println("Precio 1: " + precio1);
        System.out.println("Precio 2: " + precio2);
        resultado = precio1 > precio2 || precio2 < 0; //true o false
        System.out.println("Resultado OR: " + resultado);

        //negacion -->   !
        System.out.println("Resultado NOT: " + !resultado);
        resultado = true;
        System.out.println("Resultado NOT: " + !resultado);



        // Operadores de Comparacion
        // <, >, ==, >=, <=, equals   [=(asignacion)]
        int edad1 = 20;
        int edad2 = 25;
        resultado = edad1 > edad2;
        System.out.println("Mayor: " + resultado);

        resultado = edad1 < edad2;
        System.out.println("Menor: " + resultado);

        resultado = edad1 >= edad2;
        System.out.println("Mayor igual: " + resultado);

        resultado = edad1 == edad2;
        System.out.println("Iguales: " + resultado);



    }
}
