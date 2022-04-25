/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicaexceptions;

/**
 *
 * Realizar un programa donde se provoque una excepción de tipo “error por 
 * desbordamiento”. Tratar la excepción mediante los bloques try y catch 
 * y mostrar un mensaje indicando la situación. Por ejemplo: 
 * “Se produjo un error por desbordamiento”. 
 */
public class Ejercicio1 {
    private int[] myArray = new int[3];
    
    public void causeException(){
        try {
            int i = myArray[3];
            System.out.println("El elemento del array es: " + i);
        } catch (Exception e){
            System.out.println("Se produjo un desbordamiento del arreglo: " + e);
        }
    }
}
