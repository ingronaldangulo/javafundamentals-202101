package pe.edu.peruano.entity;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tecnologia extends Producto{

    private String voltaje;
    private String generacion;

    public void encender(){

        System.out.println("Encender:" + super.getCodigo());
    }

    @Override
    public double calcularPrecio() {
        return super.getPrecio() * 10;
    }

    @Override
    public String toString() {
        return "Tecnologia{" +
                "voltaje='" + voltaje + '\'' +
                ", generacion='" + generacion + '\'' +
                ", codigo='" + super.getCodigo() + '\'' +
                '}';
    }
}
