import java.util.Scanner; 
public class Exerc9
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double deposito; 
        double juros;  
        double rendimento;

        System.out.print("Digite o valor do deposito:" );  	 
        deposito = input.nextDouble(); 

        juros = (deposito * 0.70) / 100;
        
        rendimento = juros + deposito; 
 	   
	System.out.print("O rendimento da poupança no mês foi de" +rendimento+ "R$" );           
    }
}