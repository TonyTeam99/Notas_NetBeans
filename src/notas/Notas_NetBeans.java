package notas;

import java.util.Scanner;

public class Notas_NetBeans {

    @Deprecated
	public static void main(String[] args) {
		Califica.main(args);
	}

    public static String califica(int num_nota) {
        String calificacion;
        if (num_nota >= 0 && num_nota < 5)
            calificacion = "Suspenso";
        else if (num_nota >= 5 && num_nota < 7)
            calificacion = "Aprobado";
        else if (num_nota >= 7 && num_nota < 9)
            calificacion = "Notable";
        else if (num_nota >= 9 && num_nota <= 10)
            calificacion = "Sobresaliente";
        else
            calificacion = "La nota introducida no es correcta";
        return calificacion;
    }
}