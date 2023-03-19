/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
      System.out.print("Ingrese el primer número (A): ");
      int a = sc.nextInt();
       
      System.out.print("Ingrese el segundo número (B): ");
      int b = sc.nextInt();
       
      if (a > b) {
         System.out.println("A es mayor que B.");
      } else if (a < b) {
         System.out.println("A es menor que B.");
      } else {
         System.out.println("A es igual a B.");
      }
      sc.close();
    }
}
