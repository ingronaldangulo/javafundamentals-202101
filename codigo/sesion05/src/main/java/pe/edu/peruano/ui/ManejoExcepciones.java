package pe.edu.peruano.ui;

public class ManejoExcepciones {

    public static void main(String[] args){

        int edad = 0;
        try{
            System.out.println("Cuerpo del try");
             edad = Integer.valueOf("wwww");
        }catch (Exception exception){
            System.out.println("Exception");
            exception.printStackTrace();
            edad = 0;
        }finally {
            System.out.println("FINNNN :" + edad);

        }

    }
}
