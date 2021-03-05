package pe.edu.peruano.ui;

public class EstructuraWhile {

    public static void main(String[] args){
        int i=2;
        int contador = 0;

        while(contador<150){
           //Body

            if(i%2!=0){
                contador++;
                System.out.println(i);
            }
            i++;
        }

        System.out.println("Numeros pares: " + contador);

    }
}
