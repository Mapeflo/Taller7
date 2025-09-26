/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

/**
 *
 * @author marya
 */
public class PruebaCuentaBancaria {
   
   public static void main(String[] args) {
        
       CuentaBancaria cuenta  = new CuentaBancaria("ADC1234598",1656656,"Ahorros");
       
       // error: numeroCuenta tiene acceso privado en clase CuentaBancaria
       cuenta.numeroCuenta = ADC67577887;
    }   
}
