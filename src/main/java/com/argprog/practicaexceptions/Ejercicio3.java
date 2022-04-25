/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argprog.practicaexceptions;

/**
 *
 * Realizar una clase de Excepciones Personalizada que extienda de la clase 
 * Exception. Implementar los diferentes métodos que sean necesarios teniendo en
 * cuenta cada uno de los mensajes personalizados que podrían arrojar. 
 * Provocar la ejecución de la excepción personalizada mediante la sentencia 
 * throw para probar la ejecución de la excepción y responder… 
 * 
 * ¿Se ejecuta correctamente? ¿Qué método de la excepción se ejecutó?
 */
public class Ejercicio3 {

    public Ejercicio3() throws MyException {
        try {
            checkInput(10);
            checkInput(-1);
        } catch (Exception e){
            System.out.println("Algo falló:");
            System.out.println(e.getMessage());
        }
    }
    
    public static void checkInput(int num) throws MyException{
            if (num<0) {
                throw new MyException("Error: El número debe ser positivo.");
            } else {
                System.out.println("Correcto. El número " + num + " es positivo.");
            }
        }
    
    
    
    
}
