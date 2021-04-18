package pe.edu.peruano.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class DetalleVenta {

    private double precio;
    private double cantidad;
    private Venta venta;
    private Producto producto;
}
