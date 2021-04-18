package pe.edu.peruano.ui;

import pe.edu.peruano.entity.Cliente;
import pe.edu.peruano.entity.CuentaAhorro;

public class PooTest {

    public  static  void main(String[] args){

        CuentaAhorro ahorro;

        ahorro = new CuentaAhorro();
        ahorro.setNumeroCuenta("343434356565");
        ahorro.setSaldoDisponible(2500.00);
        System.out.println("Nro cuenta: " +  ahorro.getNumeroCuenta());
        System.out.println("Saldo disponible: " +  ahorro.getSaldoDisponible());

        System.out.println("toString: " + ahorro);

        /*CuentaAhorro ahorro2 = new CuentaAhorro("SOL", 3000.00);
        System.out.println("Moneda: " +  ahorro2.getTipoMoneda());
        System.out.println("Saldo disponible: " +  ahorro2.getSaldoDisponible());

        CuentaAhorro ahorro3 = new CuentaAhorro("DOL", 3000.00);
        System.out.println("Moneda: " +  ahorro2.getTipoMoneda());
        System.out.println("Saldo disponible: " +  ahorro2.getSaldoDisponible());

        boolean validacion = (ahorro2.equals(ahorro3));
        System.out.println("Equals: " +  validacion);
        System.out.println("Hashcode: " +  ahorro3.hashCode());*/

        //poner codigo si no lanza error
        //incializacion de variables
        try{
            //todo el codigo fuente (SI y NO)
        }catch (Exception e){
            //los valores por defecto
            // el compportamiento alternativo ante el error
        }

        //CLIENTE
        Cliente cliente1 = new Cliente();
        cliente1.setDni("44379999");
        System.out.println(cliente1.getDni());

    }
}
