import java.util.Scanner; 
public class Exerc8
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double real;
        double dolar;
        double cotacao;

        System.out.print("Digite a quantidade em dolar: ");    
        dolar = input.nextDouble(); 

        System.out.print("Digite a cotação do dolar: ");     
        cotacao = input.nextDouble(); 

        real = dolar * cotacao; 

        System.out.printf("Quantia em reais: " +real+ "R$"); 
    } 
} 