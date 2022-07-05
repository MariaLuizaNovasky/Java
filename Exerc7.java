import java.util.Scanner; 
public class Exerc7
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double c;
        double f; 

        System.out.print("Digite a temperatura em Graus Celsius: "); 
        c = input.nextDouble(); 

        f = (9 * c + 160) / 5; 

        System.out.printf("A temperatura convertida para Fahrenheit é: " +f); 
    }
} 