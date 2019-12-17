/*
Programa que lee desde teclado la temperatura de una semana(todos los días)
y calcula la temperatura media. Permite después introducir un día y nos dice la
temperatura que hizo ese día.
 */
package ejercicio2;
import java.util.*;
/**
 *
 * @author admin
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temperaturas[] = new double[7];
        String diasSemana[]={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        double suma = 0;
        int dia;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Anota temperatura de la semana");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(diasSemana[i] + ":");
            temperaturas[i] = sc.nextDouble();
            suma = suma + temperaturas[i];
        }

        System.out.println("La temperatura media ha sido:" + suma / 7);

        do {
            System.out.println("Anota día del que quieras saber la temperatura:");
            dia = sc.nextInt();
        } while (dia<1 || dia>7);
        
        System.out.println("La temperatura fue "+ temperaturas[dia-1] );
    }
    
}
