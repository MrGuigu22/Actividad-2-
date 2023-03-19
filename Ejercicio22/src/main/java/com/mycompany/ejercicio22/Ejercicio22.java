/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22;

/**
 *
 * @author santi
 */
import java.util.Scanner;
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el salario básico por hora: ");
        double salarioPorHora = sc.nextDouble();
        
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        double horasTrabajadas = sc.nextDouble();

        double salarioMensual = salarioPorHora * horasTrabajadas;

        if (salarioMensual > 450000) {
            System.out.println("El salario mensual de " + nombre + " es $" + salarioMensual);
        } else {
            System.out.println(nombre);
        }
    }
}
