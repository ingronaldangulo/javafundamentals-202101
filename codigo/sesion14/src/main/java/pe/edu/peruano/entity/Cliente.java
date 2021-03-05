package pe.edu.peruano.entity;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cliente {

    private int id;
    private String documentoIdentidad;
    private String descripcion;
    private String correo;
    private String telefono;
}
