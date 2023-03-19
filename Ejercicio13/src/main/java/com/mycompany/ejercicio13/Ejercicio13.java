/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
      System.out.print("Ingrese el valor total de la compra: ");
      double valorCompra = sc.nextDouble();
       
      System.out.print("Ingrese el color de la bolita: ");
      String colorBolita = sc.next();
       
      double valorFinal = valorCompra;
      if (colorBolita.equalsIgnoreCase("verde")) {
         valorFinal = valorCompra * 0.9; 
      } else if (colorBolita.equalsIgnoreCase("amarilla")) {
         valorFinal = valorCompra * 0.75;
      } else if (colorBolita.equalsIgnoreCase("azul")) {
         valorFinal = valorCompra * 0.5; 
      } else if (colorBolita.equalsIgnoreCase("roja")) {
         valorFinal = 0; 
      }
       
      System.out.println("El cliente deberá pagar $" + valorFinal + " por su compra.");
       
      sc.close();
    }
}
