/*
* Problema 2:
* Calcula la media aritmetica de tres numeros ingresados por teclado
*/
import java.util.Scanner;

public class MediaAritmetica {
    
    // Metodo principal
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double resultado;
       
       System.out.print("Primer valor: ");
       double numUno = entrada.nextDouble();
       
       System.out.print("Segundo valor: ");
       double numDos = entrada.nextDouble();
       
       System.out.print("Tercer valor: ");
       double numTres = entrada.nextDouble();
       
       resultado = (numUno + numDos + numTres) / 3;
       System.out.println("La media aritmetica es " + resultado);
    }
}
