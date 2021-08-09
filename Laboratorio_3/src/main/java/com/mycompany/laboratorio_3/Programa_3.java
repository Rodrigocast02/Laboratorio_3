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
public class Programa_3 {
    public static void main (String[] args)
    {
        int rod,andrea,esteban,tot;
        Scanner var;
        var = new Scanner(System.in);
        
        System.out.println("Ingrese los dolares que tiene Rodrigo: ");
        rod= var.nextInt();
        andrea = rod/2;
        esteban = (rod+andrea)/2;
        tot = rod+andrea+esteban;
        System.out.println("Rodrigo tiene: " + rod + "$");
        System.out.println("Andrea tiene: " + andrea + "$");
        System.out.println("Esteban tiene: " + esteban + "$");
        System.out.println("En total los tres poseen: " +tot + "$");
        
    }
}
