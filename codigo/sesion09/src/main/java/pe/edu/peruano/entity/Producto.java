package pe.edu.peruano.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private String codigo;
    private String nombre;
    private double precio;

    public double calcularPrecio(){
        return  precio * 2;
    }


}
