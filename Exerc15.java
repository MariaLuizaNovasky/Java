import java.util.Scanner; 
public class Exerc15
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

        if (x > y){ 
            System.out.println(+x+ "…" +y); 

        }else{ 
            
            if (x < y) { 
                System.out.print (+y+ "..." +x); 
            } 
        } 

    }
}
