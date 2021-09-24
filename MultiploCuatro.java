/*
* Problema 1:
* Calcula los N primeros multiplos de 4 (4 incluido) donde N es un valor introducido por teclado.
*/
import java.util.Scanner;

public class MultiploCuatro {
    
    // Metodo principal
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Cantidad de multiplos de cuatro: ");
       int N = entrada.nextInt(); // 3
       
       int count = 4;
       
       for (int i = 0; i < N; i++) {
           System.out.println(count);
           count +=4;
       }
       /*
       Step 1:
       i = 0, i < 3? SI. Entonces --> Imprime el valor actual de count = 4, count = 8, i = 1.
       
       Step 2:
       i = 1, i < 3? SI. Entonces --> Imprime el valor actual de count = 8, count = 12, i = 2.
       
       Step 3:
       i = 2, i < 3? SI. Entonces --> Imprime el valor actual de count = 12, count = 16, i = 3.
       
       Step 4:
       i = 3, i < 3? NO. Entonces --> Se detiene el ciclo for.
       */
    }
}
