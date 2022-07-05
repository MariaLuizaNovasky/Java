import java.util.Scanner; 
public class Exerc12
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        double raio;  	  
        double pi = 3.14;  	  
        double area; 

        System.out.print("Digite o raio do circulo: ");  	  
        raio = input.nextDouble();
        
        area = pi * (raio * raio);  
	System.out.print("A Area do circulo é: " +area);  
    }
}