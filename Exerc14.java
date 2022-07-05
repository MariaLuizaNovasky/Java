import java.util.Scanner; 
public class Exerc14
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Digite um numero: ");
        x = input.nextInt(); 

        System.out.print("Digite um número diferente: ");      
        y = input.nextInt(); 

        if (x < y){ 
            System.out.printf("O numero" +x+ "é o menor"); 

        } else {        

            if (x > y){ 
                System.out.printf("O numero" +y+ "é menor"); 

            } 
        } 
    } 
} 
