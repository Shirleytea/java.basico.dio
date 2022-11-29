import java.util.Scanner;

/*Faça um programa que peça N números inteiros, calcule e 
 * mostre a quantidade de números pares e a quantidade de 
 * números ímpares*/

public class Ex_ParEimpar {
   
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares =0;

        System.out.println("Qunatidade de números:");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Numero:");
            numero = scan.nextInt();

            if (numero % 2 == 0 )quantPares++; //quantPares=quantPares+1;//
            else quantImpares++;

             count = count + 1;         //count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par" + quantPares);
        System.out.println("Quantidade ímpares" + quantImpares);
    }

}
