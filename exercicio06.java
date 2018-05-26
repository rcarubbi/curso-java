package Trabalho;

import java.io.*;
public class exercicio06 //Peso ideal
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		String sexo; 
		double altura, peso;
		try
		{
			System.out.print("\n\t\tCalculo do peso ideal");
			System.out.print("\n\nDigite o sexo (m/f)..:");
            sexo = entrada.readLine();
			if (sexo.equals("m") || sexo.equals("f"))
			{
				System.out.print("\nDigite a altura..:");
				altura = Double.parseDouble(entrada.readLine());
				if (sexo.equals("m"))
					peso = (72.7 * altura)-58;
				else
					peso = (62.1 * altura)-44.7;
				System.out.print("\nPeso ideal..:"+peso+"\n\n");
			}
			else
				System.out.print("\nSexo invalido!\n\n");
		}
		catch(Exception e)
		{
			System.out.println("\nErro!\n\n");
		}
	}
}