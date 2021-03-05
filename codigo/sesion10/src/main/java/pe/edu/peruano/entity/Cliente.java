package pe.edu.peruano.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    public static final String RUC = "32323233333";

    protected String correo;

    protected String telefono;

    protected String obtenerDocumentoIdentidad(){
        return "";
    }

    protected String obtenerNombres(){
        return "";
    }
}
