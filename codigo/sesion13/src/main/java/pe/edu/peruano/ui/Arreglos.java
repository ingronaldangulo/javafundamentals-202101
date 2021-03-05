package pe.edu.peruano.ui;

import pe.edu.peruano.entity.Categoria;

public class Arreglos {


    public static void main(String[] args) {

        System.out.println("--Arreglo de datos primitivos---");
        int edad;
        int notas[] = new int[5];

        notas[0] = 18;
        notas[3] = 20;
        System.out.println("Nota 1: " + notas[0]);
        System.out.println("Nota 4: " + notas[3]);

        for(int i=0;i<5;i++){
            notas[i] = 10 + i;
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        System.out.println("--Arreglo de datos tipo clase----");
        Categoria categorias[] = new Categoria[5];
        for(int i=0;i<5;i++){
            Categoria categoria = Categoria.builder()
                    .codigo(i+1).nombre("Categoria 00"+ (i+1))
                    .build();
            categorias[i] = categoria;

            System.out.println("Categoria " + (i+1) + ": " + categorias[i]);
        }



    }
}
