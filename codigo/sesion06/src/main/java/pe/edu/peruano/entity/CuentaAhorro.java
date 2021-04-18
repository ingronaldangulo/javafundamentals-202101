package pe.edu.peruano.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class CuentaAhorro{

    private String  numeroCuenta;
    private Cliente  cliente;
    private String  tipoMoneda;
    private double  saldoDisponible;
    private String  codigoCuentaInterbancario;


}
