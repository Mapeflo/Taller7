package taller7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marya
 */
public class Empleado {
    
   public String nombre;
          double salario;       

    public Empleado() {
        this.nombre = "Sin nombre";
        this.salario = 0;
    }     
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if (salario>=0){
        this.salario = salario;
    } else {
        System.out.println("Salario negativo");
        this.salario = 0;
  }
 }
}
