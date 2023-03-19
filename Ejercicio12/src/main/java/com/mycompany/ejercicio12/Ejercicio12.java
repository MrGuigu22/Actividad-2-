/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;

/**
 *
 * @author santi
 */
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       
      System.out.print("Ingrese los nombres del trabajador: ");
      String nombres = sc.nextLine();
       
      System.out.print("Ingrese el número de horas trabajadas en la semana: ");
      int horasTrabajadas = sc.nextInt();
       
      System.out.print("Ingrese el valor recibido por una hora normal de trabajo: ");
      double valorHoraNormal = sc.nextDouble();
       
      double salario = 0;
      if (horasTrabajadas <= 40) {
         salario = horasTrabajadas * valorHoraNormal; 
      } else {
         int horasExtras = horasTrabajadas - 40; 
         if (horasExtras <= 8) {
            salario = 40 * valorHoraNormal + horasExtras * valorHoraNormal * 2; 
         } else {
            salario = 40 * valorHoraNormal + 8 * valorHoraNormal * 2 + (horasExtras - 8) * valorHoraNormal * 3;
         }
      }    
      System.out.println("El trabajador " + nombres + " recibirá un salario de $" + salario);
       
      sc.close();
    }
}
