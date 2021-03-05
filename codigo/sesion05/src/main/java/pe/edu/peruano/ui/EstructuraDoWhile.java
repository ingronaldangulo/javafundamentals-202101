package pe.edu.peruano.ui;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstructuraDoWhile {

    public  static void main(String[] args){
        int nota = 0;
        long precio;

        String nombre;

        Scanner scanner = new Scanner(System.in);

        do{

            System.out.print("Ingrese nota:");
            nota = scanner.nextInt();


            System.out.print("Ingrese precio:");
            precio = scanner.nextLong();

            System.out.print("Ingrese nombre:");
            nombre = scanner.next();

            System.out.println("*********************");
            System.out.println(nota);
            System.out.println(precio);
            System.out.println(nombre);


        }while(nota < 0 || nota > 20);
    }
}
