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
        double suma = 0,max=0,min=0;
        int dia,posMax=0,posMin=0;
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        do {
        System.out.println("Anota temperatura de la semana");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(diasSemana[i] + ":");
            temperaturas[i] = sc.nextDouble();
            suma = suma + temperaturas[i];
            if (i==0){
                min=temperaturas[0];posMin=0;
                max=temperaturas[0];posMax=0;
            }
            else{
                if (temperaturas[i]>=max){
                    max=temperaturas[i];
                    posMax=i;
                }
                if (temperaturas[i]<=min){
                    min=temperaturas[i];
                    posMin=i;
                }
            }
        }

        System.out.println("La temperatura media ha sido:" + suma / 7);
        System.out.println("La máxima fue de "+max+" grados el "+diasSemana[posMax]);
        System.out.println("El mínimo fue de "+min+" grados el "+diasSemana[posMin]);
        do {
            System.out.println("Anota día del que quieras saber la temperatura:");
            dia = sc.nextInt();
        } while (dia<1 || dia>7);
        
        System.out.println("La temperatura fue "+ temperaturas[dia-1] );
        
        System.out.println("Deseas repetir el ejercicio? (true/false)");
        seguir = sc.nextBoolean();
        
        } while (seguir == true);
    }
    
}
