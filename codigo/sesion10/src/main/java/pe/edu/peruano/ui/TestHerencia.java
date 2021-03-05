package pe.edu.peruano.ui;


import pe.edu.peruano.entity.Ciclista;
import pe.edu.peruano.entity.Cliente;
import pe.edu.peruano.entity.ClienteJuridico;
import pe.edu.peruano.entity.ClienteNatural;

public class TestHerencia {

    public static void main(String[] args) {

        ClienteNatural clienteNatural = ClienteNatural.builder()
                .dni("23232323")
                .primerNombre("Ronald").apellidoPaterno("Angulo")
                .build();

        clienteNatural.setCorreo("aa@gg.com");
        clienteNatural.setTelefono("9887878778");

        System.out.println("C. N.: " + clienteNatural.obtenerDocumentoIdentidad());

        ClienteJuridico clienteJuridico = ClienteJuridico.builder()
                .ruc("12323232323456")
                .razonSocial("Empresa ABC")
                .build();

        clienteJuridico.setCorreo("aa@gg.com");
        clienteJuridico.setTelefono("9887878778");

        System.out.println("C. J.: " + clienteJuridico.obtenerDocumentoIdentidad());

        System.out.println(Ciclista.EMPRESA);



    }
}
