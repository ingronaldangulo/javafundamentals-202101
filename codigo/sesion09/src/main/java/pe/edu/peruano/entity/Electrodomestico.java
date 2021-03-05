package pe.edu.peruano.entity;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Electrodomestico extends Producto {

    private double precio;
    private String corriente;

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", corriente='" + corriente + '\'' +
                ", codigo='" + super.getCodigo() + '\'' +
                '}';
    }
}
