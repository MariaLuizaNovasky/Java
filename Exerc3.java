import java.util.Scanner; 
public class Exerc3
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);      
        double TaxaDeConsumo;   
        double km1; 
        double km2; 
        double kmtotal; 
        double litros;

        System.out.print("Informe o km inicial: ");
        km1 = input.nextDouble();

        System.out.print ("Informe o km final: ");
        km2 = input.nextDouble();

        System.out.print ("Informe a quantidade de litros consumidos: ");
        litros = input.nextDouble();

        kmtotal = km2 - km1;
        TaxaDeConsumo = kmtotal / litros;

        System.out.println ("O total percorrido foi de: "+kmtotal+ "km");
        System.out.println ("A taxa media de consumo é de: "+TaxaDeConsumo+ "litros por km percorrido");
    }
}