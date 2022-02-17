/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Califica {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Para pedir números por teclado
        int nota = 0;
        String calificacion = "";
        System.out.print("Introduzca una nota: ");
        nota = reader.nextInt();
        // Este método llama al método de Notas.java
        calificacion = Notas_NetBeans.califica(nota);
        // Se muestra por pantalla la calificación final.
        System.out.println(calificacion);
        reader.close();
    }

}
