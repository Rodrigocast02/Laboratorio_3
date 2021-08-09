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
public class Programa_5 {
    public static void main(String[] args)
    {
        int participacion,parcial1,parcial2,examf;
        double por1,por2,por3,por4,tot;
        Scanner var;
        var = new Scanner(System.in);
        
        System.out.println("Ingrese la nota de la participacion del alumno: ");
        participacion= var.nextInt();
        System.out.println("Ingrese la nota del primer parcial del alumno: ");
        parcial1= var.nextInt();
        System.out.println("Ingrese la nota del segundo parcial del alumno: ");
        parcial2= var.nextInt();
        System.out.println("Ingrese la nota del examen final del alumno: ");
        examf= var.nextInt();
        por1= participacion*0.1;por2= parcial1*0.25;por3= parcial2*0.25;por4= examf*0.4;
        tot= por1+por2+por3+por4;
        System.out.println("La nota final es de:" + tot);
        
       
    }
}
