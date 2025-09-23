/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

/**
 *
 * @author marya
 */
public class PruebaEmpleado {
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado ("Luis", 1000000);
        Empleado empleado2 = new Empleado ("Sofia", 2000000);
        
        System.out.println("Nombre: " + empleado.nombre);
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("Nombre: " + empleado2.nombre);
        System.out.println("Salario: " + empleado2.getSalario());
          
    }
}
