import java.util.Scanner; 
public class Exerc4
{ 
    public static void main(String[] args)
    { 

        Scanner input = new Scanner(System.in); 
        double salarioFixo;
        double vendas;
        double comissao;
        double salarioFinal;
        String nomeVendedor;

        System.out.print ("Digite o nome do Vendedor: ");
        nomeVendedor = input.nextLine();

        System.out.print ("Digite o total de vendas efetuadas pelo vendedor: ");
        vendas = input.nextDouble();

        System.out.print ("Digite o salario fixo do vendedor: ");
        salarioFixo = input.nextDouble();

        comissao = (vendas * 15)/100;
        salarioFinal = comissao + salarioFixo;

        System.out.println("Nome do vendedor: " +nomeVendedor);
        System.out.println("Salario Fixo: " +salarioFixo+ "reais");
        System.out.println("Salario Final:" +salarioFinal+ "reais");
    }
}