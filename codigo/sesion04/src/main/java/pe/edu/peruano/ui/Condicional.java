package pe.edu.peruano.ui;

public class Condicional {



   public static  void main(String[] args){
       double saldo = 10.00;

       //condicional simple
       if(saldo > 0.0 ){
           System.out.println("Se puede realizar la transaccion");

       }

       //Condicional doble
       int nota = 4;
       int periodo = 202101;
       if(nota>12 && periodo == 202101){
           System.out.println("Aprobado");
           System.out.println("Aprobado");
           System.out.println("Aprobado");

       }else{
           System.out.println("Desaprobado");
           System.out.println("Desaprobado");
           System.out.println("Desaprobado");
           System.out.println("Desaprobado");
           System.out.println("Desaprobado");
           System.out.println("Desaprobado");

       }

       //Condicionales anidados
       int edad = 88;

       if(edad > 0 && edad <= 20){
           System.out.println("Tipo A");
       }else if(edad > 20 && edad <= 40){
           System.out.println("Tipo B");
       }else if(edad > 40 && edad <= 60){
           System.out.println("Tipo C");
       }else{
           System.out.println("Tipo D");
       }

       //Operador ternario
       String tipoPersona = edad <= 45 ? "Joven" : "Adulto";
       System.out.println("Tipo de persona: " +  tipoPersona);



   }

}
