package pe.edu.peruano.entity;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Producto {

    private String codigo;
    private String nombre;
    private Categoria categoria;


}
