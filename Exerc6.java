import java.util.Scanner; 
public class Exerc6
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in); 
        int a;
        int b; 
        int c; 

        System.out.print("Digite o valor de A: ");
        a = input.nextInt(); 

        System.out.print("Digite o valor de B: ");         
        b = input.nextInt(); 

        c = a;      
        a = b;                 
        b = c; 

        System.out.println("O valor de A é: " +a); 
        System.out.println("O valor de B é: " +b); 
    } 
} 
