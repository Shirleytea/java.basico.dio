import java.util.Scanner;

public class media_idade {

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int numero_de_pessoas;
    int media = 0;
    int soma = 0;

    int count = 0;
    do {
        System.out.println("Informe sua idade");
        numero_de_pessoas = scan.nextInt();

        soma = soma + numero_de_pessoas;
        media = soma + numero_de_pessoas / 3;

        if(media < 22){
            System.out.println("Jovem");
        }
          
        else if(media < 59){
            System.out.println("Adulta");
        }

        else 
        System.out.println("Idosa");
        
       count = count + 1;
       } while(count < 3);


   }
}