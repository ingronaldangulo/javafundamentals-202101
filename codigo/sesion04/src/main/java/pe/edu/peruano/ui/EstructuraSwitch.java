package pe.edu.peruano.ui;

public class EstructuraSwitch {

    public  static  void main(String[] arg){

        int edad = 61;
        switch (edad){

            case 10:
                break;
            case 20:
                System.out.println("Tipo A");
                if(edad > 20){}
                switch (edad){

                }
                break;
            case 30:
                System.out.println("Tipo B");
            case 40:
                System.out.println("Tipo B");
                break;
            case 50:
                System.out.println("Tipo C");
                break;
            case 60:
                System.out.println("Tipo c");
                break;
            case 70:
                System.out.println("Tipo D");
                break;
            default:
                System.out.println("Tipo NO EXISTE");
                break;
        }
    }
}
