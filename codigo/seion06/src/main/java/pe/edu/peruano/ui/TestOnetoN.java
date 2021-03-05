package pe.edu.peruano.ui;

import pe.edu.peruano.entity.Cliente;
import pe.edu.peruano.entity.CuentaAhorro;

public class TestOnetoN {

    public  static  void main(String[] args){

        Cliente cliente = Cliente.builder()
                .dni("34896745")
                .apellidos("sfsdfsd")
                .correo("sss@ggg.co")
                .nombres("sfsdfsds")
                .build();

        CuentaAhorro ahorro1 = CuentaAhorro.builder()
                .numeroCuenta("343434343")
                .tipoMoneda("SOL")
                .codigoCuentaInterbancario("333333")
                .saldoDisponible(100.00)
                .cliente(cliente)
                .build();

        CuentaAhorro ahorro2 = CuentaAhorro.builder()
                .numeroCuenta("4564564564")
                .tipoMoneda("SOL")
                .codigoCuentaInterbancario("4343434")
                .saldoDisponible(200.00)
                .cliente(cliente)
                .build();

        System.out.println("--CTA 01----------------");
        System.out.println("Numero de cuenta: " + ahorro1.getNumeroCuenta());
        System.out.println("Tipo de moneda: " + ahorro1.getTipoMoneda());
        System.out.println("Saldo: " + ahorro1.getSaldoDisponible());
        System.out.println("Cliente: " + ahorro1.getCliente().getDni() + " " + ahorro1.getCliente().getApellidos());

        System.out.println("--CTA 02----------------");
        System.out.println("Numero de cuenta: " + ahorro2.getNumeroCuenta());
        System.out.println("Tipo de moneda: " + ahorro2.getTipoMoneda());
        System.out.println("Saldo: " + ahorro2.getSaldoDisponible());
        System.out.println("Cliente: " + ahorro2.getCliente().getDni() + " " + ahorro2.getCliente().getApellidos());


    }
}
