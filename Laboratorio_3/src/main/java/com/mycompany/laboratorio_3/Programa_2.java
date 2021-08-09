/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio_3;

/**
 *
 * @author casti
 */
import java.util.*;
public class Programa_2 {
    public static void main(String[] args)
    {
       int horas,suel,tot;
       Scanner var;
        var = new Scanner(System.in);
       
       System.out.println("Ingrese las horas que trabajo durante la semana: ");
       horas = var.nextInt();
       System.out.println("Ingrese sueldo por hora: ");
       suel = var.nextInt();
       tot = horas*suel;
       System.out.println("El sueldo semanal es de: " + tot);
       
      
    }
}
