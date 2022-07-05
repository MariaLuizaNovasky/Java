import java.util.Scanner; 
public class Exerc5
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in);  
        String nomeAluno;
        double nota1;
        double nota2;
        double nota3;
        double mediaFinal; 
        
        System.out.print ("Digite o nome do aluno: ");
        nomeAluno = input.nextLine();
        
        System.out.print("Digite a nota da primeira prova: ");
        nota1 = input.nextDouble();
        
        System.out.print("Digite a nota da segunda prova: ");
        nota2 = input.nextDouble();
        
        System.out.print("Digite a nota da terceira prova: ");
        nota3 = input.nextDouble();
        
        mediaFinal = (nota1 + nota2 + nota3) / 3;
        
        System.out.println ("Nome do aluno: "+nomeAluno);
        System.out.println ("A media do aluno é: " +mediaFinal);   
    }
}