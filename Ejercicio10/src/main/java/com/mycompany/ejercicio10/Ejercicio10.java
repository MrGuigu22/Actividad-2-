/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
         
      Scanner sc = new Scanner(System.in);
       
      System.out.print("Ingrese el número de inscripción: ");
      int numeroInscripcion = sc.nextInt();
       
      System.out.print("Ingrese los nombres del estudiante: ");
      sc.nextLine(); 
      String nombres = sc.nextLine();
       
      System.out.print("Ingrese el patrimonio del estudiante: ");
      double patrimonio = sc.nextDouble();
       
      System.out.print("Ingrese el estrato social del estudiante: ");
      int estratoSocial = sc.nextInt();
       
      double pagoMatricula = 50000; 
      if (patrimonio > 2000000 && estratoSocial > 3) {
         pagoMatricula += patrimonio * 0.03;
      }
       
      System.out.println("Número de inscripción: " + numeroInscripcion);
      System.out.println("Nombres: " + nombres);
      System.out.println("Patrimonio: $" + patrimonio);
      System.out.println("Pago de matrícula: $" + pagoMatricula);
       
      sc.close();
    }
}
