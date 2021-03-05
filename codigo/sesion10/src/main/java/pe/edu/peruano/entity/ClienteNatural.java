package pe.edu.peruano.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteNatural extends  Cliente{

    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String dni;

    @Override
    public String obtenerDocumentoIdentidad() {
        return this.dni;
    }
}
