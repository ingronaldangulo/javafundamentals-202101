package pe.edu.peruano.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Venta {

    private Date fecha;
    private Cliente cliente;
    private String tipoDocumento;
    private String serie;
    private String correlativo;
    private List<DetalleVenta> lstDetalleVenta;

    //nivel de acceso | tipo de retorno | nombre del metodo
    // (parametros: tipo de dato y nombre)

    public void agregarDetalle(DetalleVenta detalle){

        if(lstDetalleVenta == null){
            lstDetalleVenta = new ArrayList<>();
        }
        lstDetalleVenta.add(detalle);

    }




}
