package pe.edu.peruano.ui;

public class EstructuraFor {

    public static void main(String[] args){
        //int i;
        for(int i=0; i<100; i+=2){
            //body
            System.out.println(i);

            if(i%2==0){
                System.out.println("Numero PAR");
            }else{
                System.out.println("Numero IMPAR");
            }
        }

        //Operadores de incremento
        System.out.println("----------------------------------------");
        int a = 20;
        System.out.println(a++);
        System.out.println(a);

        int b = 20;
        System.out.println(++b);
        System.out.println(b);
        System.out.println("----------------------------------------");

        int c = 20;
        System.out.println(c--);
        System.out.println(c);

        int d = 20;
        System.out.println(--d);
        System.out.println(d);

        //Incremento de variables
        int edad = 20;
        int precio = 30;

        edad = (edad + 20);
        edad += 20;

        precio = precio - 5;
        precio -= 5;

    }
}
