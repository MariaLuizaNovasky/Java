import java.util.Scanner; 
public class Exerc11
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double precoDeCusto;  	   
        double acrescimo;  	   
        double valorVenda;

        System.out.print("Digite o preço de custo do produto: ");     
        precoDeCusto = input.nextDouble(); 

        System.out.print("Digite a porcentagem de acrescimo: ");     
        acrescimo = input.nextDouble(); 
        
        valorVenda = (precoDeCusto * acrescimo) / 100 + precoDeCusto; 
 	    
        System.out.printf("O valor de venda do produto é: " +valorVenda+ "R$"); 
    }
}