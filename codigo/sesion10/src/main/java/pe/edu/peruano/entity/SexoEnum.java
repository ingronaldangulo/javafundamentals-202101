package pe.edu.peruano.entity;

import lombok.Getter;

@Getter
public enum SexoEnum {
    MASCULINO("M","Hombres"),
    FEMENINO("F","Mujeres");

    private String codigo;
    private String descripcion;

    SexoEnum(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
}
