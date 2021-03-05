package pe.edu.peruano.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteJuridico extends Cliente{

    private String ruc;

    private String razonSocial;

    @Override
    public String obtenerDocumentoIdentidad(){
        return this.ruc;
    }
}
