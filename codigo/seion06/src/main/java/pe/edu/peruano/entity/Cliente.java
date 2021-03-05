package pe.edu.peruano.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Cliente {

    private String dni;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;



}
