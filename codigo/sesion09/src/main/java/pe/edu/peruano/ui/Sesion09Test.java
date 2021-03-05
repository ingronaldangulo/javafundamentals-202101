package pe.edu.peruano.ui;

import pe.edu.peruano.entity.Curso;

public class Sesion09Test {

    public static void main(String[] args) {

        Curso fundamentos = new Curso("ddfdfd");
        fundamentos.insertarDatos("3434343");
        System.out.println("Fundamentos: " +  fundamentos);




        Curso disoft = new Curso();
        disoft.insertarDatos("343434", "Diseño de Software");
        System.out.println("disoft: " +  disoft);

        //disoft.

        Curso estdat = new Curso("343433", "Estructura de Datos");
        estdat.insertarDatos(4);

        System.out.println("estdat: " +  estdat);
    }
}
