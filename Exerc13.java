import java.util.Scanner; 
public class Exerc13
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("digite um número: ");     
        num = input.nextInt(); 

        if (num >= 20){
            System.out.print("numero" +num+ " é maior que 20"); 

        }else{

            if(num < 20){
                System.out.print("numero" +num+ " é menor que 20"); 

            }
        }
    }
}