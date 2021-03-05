package pe.edu.peruano.ui;

import pe.edu.peruano.entity.Categoria;

import java.util.*;

public class Colecciones {

    public static void main(String[] args) {
        //Arraylist
        List<Integer> notas = new ArrayList<>();
        notas.add(24);
        notas.add(45);
        for (int i=0;i<20;i++){
            notas.add(100 + i);
        }

        System.out.println("---------ARRAYLIST--------------");
        for (Integer valor: notas) {
            System.out.println(valor);
        }
        System.out.println("# de elementos:" + notas.size());


        //Map
        System.out.println("---------MAP--------------");
        Map<String,Object> map = new HashMap<>();
        map.put("LIM","Lima");
        map.put("TRU","Trujillo");
        map.put("PI", 3.1415);

        Categoria categoria = Categoria.builder()
                .codigo(100).nombre("Tecnología").build();
        map.put("categoria", categoria);

        System.out.println(map.get("LIM"));
        System.out.println(map.get("TRU"));
        System.out.println(map.get("PI"));
        System.out.println(map.get("categoria"));

        //Set
        System.out.println("---------SET--------------");
        Set<Integer> edades = new HashSet<>();
        edades.add(20);
        edades.add(20);
        edades.add(20);
        edades.add(20);
        edades.add(20);

        edades.add(30);

        int max = 50;
        int min = 20;

        for (int i=0;i<50;i++){
            Double edad = (Math.random() * ((max-min) + 1)) +min;
            edades.add(edad.intValue());
        }


        System.out.println("# de elementos:" + edades.size());
        for (Integer edad: edades) {
            System.out.println(edad);
        }

    }
}
