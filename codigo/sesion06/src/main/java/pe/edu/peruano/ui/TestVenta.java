package pe.edu.peruano.ui;

import pe.edu.peruano.entity.*;
import pe.edu.peruano.util.Util;

import java.time.Instant;
import java.util.Date;

public class TestVenta {

    public static void main(String[] args) {

        //1. Cliente
        //Cliente clientea = new Cliente();
        //clientea.setDni("434343434");

        Cliente cliente = Cliente.builder()
                .dni("12345678")
                .nombres("Alex")
                .correo("aaa@fff.com")
                .apellidos("Tantalean")
                .build();


        //2. Venta

        Util.imprimir("sdfasdfasfasdasf sfdsf");


        Venta venta = Venta.builder()
                .fecha(Date.from(Instant.now()))
                .cliente(cliente)
                .tipoDocumento("BOLETA")
                .serie("002")
                .correlativo("0001393")
                .build();




        //2. detalles de venta

        Categoria categoria1 = Categoria.builder()
                .codigo("de4343").nombre("Tecnología").build();

        Producto producto1 = Producto.builder()
                .categoria(categoria1)
                .codigo("PR34343")
                .nombre("Computadora HP 15'")
                .build();

        DetalleVenta detalle1 = DetalleVenta.builder()
                .cantidad(40).precio(13.59)
                .venta(venta)
                .producto(producto1)
                .build();


        //detalle 2
        Categoria categoria2 = Categoria.builder()
                .codigo("4534534").nombre("Alimentos").build();

        Producto producto2 = Producto.builder()
                .categoria(categoria1)
                .codigo("PR65545")
                .nombre("Inka Kola'")
                .build();

        DetalleVenta detalle2 = DetalleVenta.builder()
                .cantidad(24).precio(12.60)
                .venta(venta)
                .producto(producto2)
                .build();

        venta.agregarDetalle(detalle1);
        venta.agregarDetalle(detalle2);

        System.out.println("----------------- VENTA -----------------");
        System.out.println("Cliente: " + venta.getCliente().getNombres() + " " + venta.getCliente().getApellidos());
        System.out.println("Tipo de documento: " +  venta.getTipoDocumento());
        System.out.println("Serie: " +  venta.getSerie());
        System.out.println("Correlativo: " +  venta.getCorrelativo());
        System.out.println("Fecha: " +  venta.getFecha());

        double total  = 0;

        System.out.println("-------------------DETALLES-------------------------");
        System.out.println("CANT.   DESCRIPCION               PRECIO     TOTAL" );
        System.out.println("-----------------------------------------------------");
        for (DetalleVenta detalle: venta.getLstDetalleVenta()) {
            System.out.println(detalle.getCantidad() + "\t " + detalle.getProducto().getNombre() +
                    "\t" + detalle.getPrecio()  + " \t" + (detalle.getCantidad() * detalle.getPrecio()));

            //total = total + (detalle.getCantidad() * detalle.getPrecio());
            total += (detalle.getCantidad() * detalle.getPrecio());
        }
        System.out.println("TOTAL:   " + total);










    }
}
