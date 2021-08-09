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
public class Programa_6 {
    public static void main(String[] args)
    {
        double a,b,res;
        Scanner var;
        var = new Scanner(System.in);
        
        System.out.println("Ingrese un valor de A: ");
        a= var.nextInt();
        System.out.println("Ingrese un valor de B: ");
        b= var.nextInt();
        res=Math.pow(a,2)+ Math.pow(b,2) + (2*a*b);
        System.out.println("El resultado de la operacion es: " + res);
        
        
    }
}
