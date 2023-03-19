/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio14;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese las ventas del departamento 1: ");
        double ventas1 = sc.nextDouble();
        System.out.print("Ingrese el salario de los vendedores del departamento 1: ");
        double salario1 = sc.nextDouble();

        System.out.print("Ingrese las ventas del departamento 2: ");
        double ventas2 = sc.nextDouble();
        System.out.print("Ingrese el salario de los vendedores del departamento 2: ");
        double salario2 = sc.nextDouble();

        System.out.print("Ingrese las ventas del departamento 3: ");
        double ventas3 = sc.nextDouble();
        System.out.print("Ingrese el salario de los vendedores del departamento 3: ");
        double salario3 = sc.nextDouble();

        double totalVentas = ventas1 + ventas2 + ventas3;

        double limiteVentas = totalVentas * 0.33;

        double pago1 = salario1;
        double pago2 = salario2;
        double pago3 = salario3;

        if (ventas1 > limiteVentas) {
            pago1 = salario1 * 1.2;
        }

        if (ventas2 > limiteVentas) {
            pago2 = salario2 * 1.2;
        }

        if (ventas3 > limiteVentas) {
            pago3 = salario3 * 1.2;
        }

        System.out.println("El pago de los vendedores del departamento 1 es: " + pago1);
        System.out.println("El pago de los vendedores del departamento 2 es: " + pago2);
        System.out.println("El pago de los vendedores del departamento 3 es: " + pago3);
    }
}
