/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicaexceptions;

import java.util.Scanner;

/**
 *
 * Realizar un programa que permita el ingreso de dos números por teclado para 
 * ser divididos entre sí. Tomar como precaución la utilización del try y el 
 * catch por si el segundo número ingresado para dividir se trata de un cero. 
 * Mostrar un mensaje adecuado en caso de que se produzca la excepción.
 */

public class Ejercicio2 {
    private int n1;
    private int n2;
    
    public void getNumbers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Indicar el dividendo: ");
        n1 = input.nextInt();
        System.out.println("Indicar el divisor: ");
        n2 = input.nextInt();
    }
    
    public void divide(){
        getNumbers();
        try{
            int result =  n1 / n2;
            System.out.println("El resultado es " + result);
        } catch (Exception e){
            System.out.println("Hubo un error en la división: " + e.getMessage());
            System.out.println(e);
        }
        
        
    }
    
}
