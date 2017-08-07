import java.util.*;
/**
 * Programa para verificar Números Primos.
 * 
 * @author (Juan León -Leonardo Sotelo) 
 * 
 */
public class NúmerosPrimos
{
    public static void main(String[] args) {
      
           
         Scanner teclado = new Scanner(System.in);
         int a = 0, i, número;
         
         System.out.println("Ingrese un numero");
         número = teclado.nextInt();
         for(i = 1; i < (número+1); i++) {
            if (número % i == 0) {
             a++;
            }
         }
            if (a!= 2) {
              System.out.println("No es Primo");
            } else {
                System.out.println("Es Primo");
            }

        }
}