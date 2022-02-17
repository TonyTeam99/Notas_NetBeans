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
public class Notas_NetBeans {
    
    // Queda obsoleto este método ya que se hace la llamada desde Califica.java
    @Deprecated
    public static void main(String[] args) {
        Califica.main(args);
    }
    
    // Dicho método devuelve una cadena con la calificación según la nota dada.
    /*
	 * Con la condición IF se determina una
	 * calificación u otra según la nota introducida.
     */
    public static String califica(int num_nota) {
        String calificacion;
        if (num_nota >= 0 && num_nota < 5) {
            calificacion = "Suspenso";
        } else if (num_nota >= 5 && num_nota < 7) {
            calificacion = "Aprobado";
        } else if (num_nota >= 7 && num_nota < 9) {
            calificacion = "Notable";
        } else if (num_nota >= 9 && num_nota <= 10) {
            calificacion = "Sobresaliente";
        } else {
            calificacion = "La nota introducida no es correcta";
        }
        return calificacion;
    }
}
