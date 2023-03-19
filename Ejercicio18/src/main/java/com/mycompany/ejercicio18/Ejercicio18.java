/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18;

/**
 *
 * @author santi
 */
import java.util.Scanner;
public class Ejercicio18 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    System.out.print("Ingrese el código del empleado: ");
    String codigo = input.nextLine();
    System.out.print("Ingrese los nombres del empleado: ");
    String nombres = input.nextLine();
    System.out.print("Ingrese el número de horas trabajadas al mes: ");
    double horasTrabajadas = input.nextDouble();
    System.out.print("Ingrese el valor de la hora trabajada: ");
    double valorHora = input.nextDouble();
    System.out.print("Ingrese el porcentaje de retención en la fuente (%): ");
    double porcentajeRetencion = input.nextDouble();
    double salarioBruto = horasTrabajadas * valorHora;
    double retencionFuente = salarioBruto * (porcentajeRetencion / 100);
    double salarioNeto = salarioBruto - retencionFuente;
    System.out.println("Código del empleado: " + codigo);
    System.out.println("Nombres del empleado: " + nombres);
    System.out.println("Salario bruto: $" + salarioBruto);
    System.out.println("Salario neto: $" + salarioNeto);
    }
}
