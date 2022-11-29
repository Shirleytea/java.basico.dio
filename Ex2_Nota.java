import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. 
Mostreuma mensagem, caso o valor seja inválido/*

public class Ex2_Nota {


/**
 * @param args
 */
public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);

     int nota;
     
     System.out.println("Nota:");
     nota = scan.nextInt();
     
     while(nota < 0 | nota > 10){
        System.out.println("Nota Inválida! Digite Novamente:");
        nota = scan.nextInt();
     }
  }
}
    
            
           
    
