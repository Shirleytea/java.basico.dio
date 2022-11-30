/*Crie um vetor de 6 números inteiros e mostre -os na
 * ordem inversa.*/


import java.util.Scanner;

public class Ex_OrdemInversa{

    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);
      
       int[] vetor = { 4, 8, 9, 7, 3, 2};

      //System.out.println(vetor.length);
     
       System.out.print("vetor:");
       int count =0;
       while(count < (vetor.length)){
           System.out.print(vetor[count] + " ");
           count ++;

       }

       System.out.print("\nvetor:");
       for(int i = (vetor.length - 1 ); i >= 0; i --) {
           System.out.print(vetor[i] + " ");
    }
    }
}
    
