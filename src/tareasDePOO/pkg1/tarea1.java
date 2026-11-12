/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasDePOO.pkg1;

import javax.swing.JOptionPane;

/* 
 TAREA DE PROGRAMACION ORIENTADA A OBJETOS
 */
public class tarea1 {
   
    public static void main(String[] args) {
        
        //EJERCICIO 1
        //Programa para el cálculo de promedio: Solicitar tres calificaciones, calcular el promedio aritmético y mostrarlo.
        double nota1=0;
        double nota2=0;
        double nota3=0;
        double promedio=0;
        
        System.out.println("===Bienvenido al programa para calcular el promedio===");
        
        
        nota1=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la primera nota."));
        nota2=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la segunda nota."));
        nota3=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tercera nota"));
        
        promedio = (nota1+nota2+nota3)/3;
        System.out.println("El promedio de las 3 calificaciones es: " + promedio);
        

    }
    
}