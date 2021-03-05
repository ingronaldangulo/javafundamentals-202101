package pe.edu.peruano.entity;

public class Test {

    public static void main(String[] args) {

        ClienteNatural clienteNatural = ClienteNatural.builder()
                .dni("23232323")
                .primerNombre("Ronald").apellidoPaterno("Angulo").build();

        clienteNatural.setCorreo("aa@gg.com");
        clienteNatural.setTelefono("9887878778");

        System.out.println("C. N.: " + clienteNatural.obtenerDocumentoIdentidad());



    }
}
