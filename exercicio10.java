package Trabalho;

import java.io.*;
public class exercicio10 //Par ou impar
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int numero;
		try
		{
			System.out.print("\n\t\tPar ou Impar");
			System.out.print("\n\nDigite um numero inteiro..:");
			numero = Integer.parseInt(entrada.readLine());
			if (numero%2 == 0){
				System.out.print("\nNumero Par!\n");}
			else{
				System.out.print("\nNumero Impar!\n");	
				}
			
		}
		catch(Exception e)
		{
			System.out.print("\nErro!\n\n");
		}
	}
}
