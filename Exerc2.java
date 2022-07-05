import java.util.Scanner; 
public class Exerc2
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in); 
        int x, y;
        int soma, subt, div, mult; 

        System.out.print("Digite o primeiro numero: ");
        x = input.nextInt();

        System.out.print("Digite o segundo numero: ");
        y = input.nextInt();

        soma = x + y;
        subt = x - y;
        div = x / y;
        mult = x * y;
        
        System.out.println ("A soma é: " +soma);
        System.out.println ("A Subtração é: " +subt);
        System.out.println ("A divisão é: " +div);
        System.out.println ("A multiplicação é: " +mult);
    }
}