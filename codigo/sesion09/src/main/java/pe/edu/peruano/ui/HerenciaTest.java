package pe.edu.peruano.ui;

import pe.edu.peruano.entity.Deporte;
import pe.edu.peruano.entity.Tecnologia;

public class HerenciaTest {

    public static void main(String[] args) {


        Tecnologia tecnologia = new Tecnologia();
        tecnologia.setNombre("Laptop HP");
        tecnologia.setCodigo("434343");
        tecnologia.setVoltaje("20V");
        tecnologia.setGeneracion("2021");
        tecnologia.setPrecio(30);
        System.out.println(tecnologia);
        System.out.println("precio:" + tecnologia.calcularPrecio());

        Deporte deporte = new Deporte();
        deporte.setColor("Amarillo");
        deporte.setCodigo("3443434");
        deporte.setTalla("L");
        deporte.setMaterial("Algodón");
        deporte.setPrecio(40);
        System.out.println(deporte);
        System.out.println("precio:" + deporte.calcularPrecio());





    }
}
