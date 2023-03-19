/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
      System.out.print("Ingrese el primer número entero: ");
      int numero1 = sc.nextInt();
       
      System.out.print("Ingrese el segundo número entero: ");
      int numero2 = sc.nextInt();
       
      System.out.print("Ingrese el tercer número entero: ");
      int numero3 = sc.nextInt();
       
      int mayor = numero1;
      if (numero2 > mayor) {
         mayor = numero2;
      }
      if (numero3 > mayor) {
         mayor = numero3;
      }
       
      System.out.println("El número mayor es: " + mayor);
      sc.close();
    }
}
