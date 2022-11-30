/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada
 * de qualquer número inteiro entre 1 a 10.
 * O usuário deve informar de qual número ele deseja ver
 * a tabuada. A saída deve ser conforme exemplo abaixo:
 * Tabuada de 5:
 * 5x1 = 5
 * 5x2 = 10
 * ------
 * 5x10 = 50
 */

import java.util.Scanner;

public class Ex_Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabuada:");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i = i + 1) {   /* ou i++ */
           System.out.println(tabuada + "X" + i + " = " + (tabuada*i));
       }

    }
}
   



