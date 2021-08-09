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
public class Programa_7 {
      public static void main(String[] args) {
       int toth,sem,dias,horas;
       Scanner var;
       var = new Scanner(System.in);
       System.out.println("Ingrese el numero total de horas");
       toth = var.nextInt();
       sem = toth/(24*7);
       dias = toth % (24*7)/24;
       horas = toth % 24;
       System.out.println("las horas totales son: " + sem + " semanas " + dias + " dias y " + horas + " horas");
       
    }
}
