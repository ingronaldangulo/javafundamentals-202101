package pe.edu.peruano.ui;

import pe.edu.peruano.entity.Atleta;
import pe.edu.peruano.entity.Ciclista;
import pe.edu.peruano.entity.Cliente;

public class TestInterface {

    public static void main(String[] args) {

        Atleta atleta = Atleta.builder().build();

        atleta.manejarBicicleta();
        atleta.manejarMotocicleta();
        atleta.correrMaraton();
        atleta.nadar();
        System.out.println(atleta.obtenerDocumentoIdentidad());
        System.out.println(Ciclista.EMPRESA);






    }
}
