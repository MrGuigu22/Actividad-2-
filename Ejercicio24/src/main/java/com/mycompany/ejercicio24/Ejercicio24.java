/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio24;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.print("Ingrese el peso de la esfera A: ");
    double pesoA = input.nextDouble();

    System.out.print("Ingrese el peso de la esfera B: ");
    double pesoB = input.nextDouble();

    System.out.print("Ingrese el peso de la esfera C: ");
    double pesoC = input.nextDouble();

    if (pesoA > pesoB && pesoA > pesoC) {
      System.out.println("La esfera A tiene el mayor peso.");
    } else if (pesoB > pesoA && pesoB > pesoC) {
      System.out.println("La esfera B tiene el mayor peso.");
    } else if (pesoC > pesoA && pesoC > pesoB) {
      System.out.println("La esfera C tiene el mayor peso.");
    } else {
      System.out.println("Al menos dos esferas tienen el mismo peso máximo.");
    }

    input.close();
    }
}
