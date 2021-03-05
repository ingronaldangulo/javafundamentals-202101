package pe.edu.peruano.entity;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Deporte extends  Producto{

    private String talla;
    private String color;
    private String material;

    @Override
    public String toString() {
        return "Deporte{" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", codigo='" + super.getCodigo() + '\'' +
                '}';
    }
}
