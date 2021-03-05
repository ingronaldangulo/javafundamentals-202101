package pe.edu.peruano.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor

@Builder
public class Atleta extends Cliente implements Ciclista, Corredor, Nadador {

    @Override
    public void manejarBicicleta() {

        System.out.println("Manejando bicicleta...");
    }

    @Override
    public void manejarMotocicleta() {
        System.out.println("Manejando motocicleta...");
    }

    @Override
    public void correrMaraton() {
        System.out.println("Corrienda maraton de 5K...");
    }

    @Override
    public void nadar() {
        System.out.println("Nadando en la piscina...");

    }

    @Override
    public String obtenerDocumentoIdentidad() {

        return "DNI...";
    }
}
