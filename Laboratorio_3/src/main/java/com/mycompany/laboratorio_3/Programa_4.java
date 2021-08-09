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
public class Programa_4 {
    public static void main(String[] args)
    {
        int car, monto;
        double comision, salario;
        Scanner var;
        var = new Scanner(System.in);
        
        System.out.println("Carros vendidos: ");
        car = var.nextInt();
        System.out.println("Ingrese el monto total por los carros vendidos: ");
        monto = var.nextInt();
        comision = monto * 0.05;
        salario = 1000 + (150 * car) + comision;
        System.out.println("El salario a cobrar total es de: " + salario);
        
    }
}
