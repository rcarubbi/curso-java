package Trabalho;

import java.io.*;
public class exercicio05 //Reajuste de Salário 
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		double sal; 
		try
		{
			System.out.print("\n\t\tReajuste de Salario");
			System.out.print("\n\nDigite o salario..: R$");
			sal = Double.parseDouble(entrada.readLine());
			if (sal <=300)
				sal = Math.round(sal * 1.50);
			else
				sal = Math.round(sal * 1.30);
			System.out.print("\nSalario Reajustado..:"+sal+"\n\n");
		}
		catch(Exception e)
		{
			System.out.println("\nErro!\n\n");
		}
	}
}