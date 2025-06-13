/**
*Clase, para una cuenta bancaria, con su titular y su saldo
*@author Terra
*@version 1.0
*@since 22-09-2015
*/
public class CuentaBancaria {

/**
*Nombre del titulas
*/
    private String titular;

/**
*Saldo de la cuenta
*/
    private double saldo;

/**
*nos guardamos el nombre del titular y saldo inicial
*@param titular Nombre el titular de la cuenta
*@param saldo Saldo inicial de la cuenta
*/
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

/**
*Devuelve el nombre del titular
*@returm titular Nombre del titular
*/
    public String getTitular() {
        return titular;
    }

/**
*Cambia nombre el titular
*@param titular Cambio del nombre del titular
*/
    public void setTitular(String titular) {
        this.titular = titular;
    }

/**
*Devuelve saldo actual
*@returm saldo Saldo actual de la cuenta
*/
    public double getSaldo() {
        return saldo;
    }

/**
*Calcula el saldo a partir de la cantidad pasada
*@param cantidad Cantidad introducida por el usuario
*/
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

/**
*comprobar si se puede retirar dinero, si te deja lo retira y si no.
*@param cantidad Cantidad de dinero que se va a retirar de la cuenta.
*@return  devuelve si se a podido retirar o no el saldo.
*/    
public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        } else {
            return false;
        }
    }

/**
*Mostrar en pantalla el titular y el saldo
*/
    public void mostrarInformacion() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: " + saldo);
    }
}

