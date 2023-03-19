/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      System.out.print("Ingresa el valor del lado: ");
      double lado = input.nextDouble();

      double perimetro = 3 * lado;
      double altura = Math.sqrt(3) * lado / 2;
      double area = (lado * altura) / 2; 

      System.out.println("El perímetro del triángulo es: " + perimetro);
      System.out.println("La altura del triángulo es: " + altura);
      System.out.println("El área del triángulo es: " + area);
    }
}
