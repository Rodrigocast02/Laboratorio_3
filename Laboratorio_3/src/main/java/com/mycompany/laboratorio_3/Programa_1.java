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
public class Programa_1 {
    public static void main(String[] args)
    {
        int nota1,nota2,nota3,suma,total;
        Scanner var;
        var = new Scanner(System.in);
        System.out.println("Ingrese la primer nota: "); nota1= var.nextInt();
        System.out.println("Ingrese la segunda nota: ");nota2= var.nextInt();
        System.out.println("Ingrese la tercera nota: ");nota3= var.nextInt();
        suma = nota1 + nota2 +nota3;
        total = suma;
        System.out.println("La suma es de: " + total);   
       
    }
}
