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
public class Programa_8 {
     public static void main(String[] args)
    {
      double a,b,c;
      double primera,resultado,resultado1,div;
      Scanner var;
      var= new Scanner(System.in);
      
      System.out.println("Ingrese valor de a: "); a= var.nextDouble();
      System.out.println("Ingrese valor de b: "); b= var.nextDouble();
      System.out.println("Ingrese valor de c: "); c= var.nextDouble();
      
      primera=((Math.pow(b,2))-((4*a*c)));
      resultado=((-b+Math.sqrt(Math.pow(b, 2)-((4*a*c)))));
      resultado1=((-b-(Math.sqrt(Math.pow(b, 2)-((4*a*c))))));
      div=(-((b)/(2*a)));
      
      if(primera>0){
          System.out.println("x1 = " +resultado/(2*a));
          System.out.println("x2 = " +resultado1/(2*a));
      }else if(primera==0) {
          System.out.println("x1 = " +div);
          System.out.println("x2 = " +div);      
      }else if(primera<0){
          System.out.println("No tiene solucion");
      }
      
      
    }
}
