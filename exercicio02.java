package Trabalho;
import java.io.*;
public class exercicio02 //Aumento de Salário 
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		double sal; 
		try
		{
			System.out.print("\n\t\tAumento de Salario");
			System.out.print("\n\nDigite o salario..: R$");
			sal = Double.parseDouble(entrada.readLine());
			if (sal <500){
				sal = sal * 1.30;
				System.out.print("\nSalario Reajustado..:"+sal+"\n\n");
			}
			else
				System.out.print("\nNao houve reajuste!\n\n");
		}
		catch(Exception e)
		{
			System.out.println("\nErro!\n\n");
		}
	}
}