package pe.edu.peruano.ui;

import pe.edu.peruano.entity.SexoEnum;
import pe.edu.peruano.entity.TipoDocumentoEnum;

public class TestEnum {

    public static void main(String[] args) {

        System.out.println(TipoDocumentoEnum.DNI.getCodigo() + " - "  + TipoDocumentoEnum.DNI.getDescripcion());
        System.out.println(TipoDocumentoEnum.CARNET_EXTRAJERIA.getCodigo() + " - "  + TipoDocumentoEnum.CARNET_EXTRAJERIA.getDescripcion());

        System.out.println("------------------------------");
        System.out.println(SexoEnum.FEMENINO);

        System.out.println(SexoEnum.FEMENINO.getCodigo() + " - " + SexoEnum.FEMENINO.getDescripcion());


        String documento = TipoDocumentoEnum.getEnumPorCodigo("004");
        System.out.println("Descripcion:" + documento);

        String prioridad = TipoDocumentoEnum.getEnumPorPrioridad(2);
        System.out.println("Prioridad:" + prioridad);
    }
}
