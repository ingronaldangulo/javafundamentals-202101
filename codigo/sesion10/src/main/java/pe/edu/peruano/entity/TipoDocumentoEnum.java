package pe.edu.peruano.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
public enum TipoDocumentoEnum {

    //3. Definir los datos de cada elemento del ENUM
    DNI("001","Documento de Identidad Nacional",1),
    CARNET_EXTRAJERIA("002", "Carnet de Extranejeria", 2),
    PASAPORTE("003", "Pasaporte",4),
    PTP("004", "Permiso Temporal de Trabajo",6);

    //1. Encapsulamiento
    private String codigo;
    private String descripcion;
    private int prioridad;

    //2. Creacion del constructor
    TipoDocumentoEnum(String codigo, String descripcion, int prioridad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }


    //4 Busquedas por cualquier atributo de ENUM
    public static String getEnumPorCodigo(String codigo){
        for(TipoDocumentoEnum e : TipoDocumentoEnum.values()){
            if(e.codigo.equals(codigo)) return e.descripcion;
        }
        return null;
    }

    public static String getEnumPorPrioridad(int prioridad){
        for(TipoDocumentoEnum e : TipoDocumentoEnum.values()){
            if(e.getPrioridad() == prioridad) return e.descripcion;
        }
        return null;
    }
}
