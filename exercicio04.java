package Trabalho;

import java.io.*;
public class exercicio04 //Maioridade
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int idade; 
		try
		{
			System.out.print("\n\t\tVerifica a maioridade");
			System.out.print("\n\nDigite a idade..:");
			idade = Integer.parseInt(entrada.readLine());
			
			          
			if (idade>=21)
				System.out.print("\nMaior de idade!\n\n");
			else
				System.out.print("\nMenor de idade!\n\n");
		}
		catch(Exception e)
		{
			System.out.println("\nErro!\n\n");
		}
	}
}