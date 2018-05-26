package Trabalho;

import java.io.*;
public class exercicio11 //Verifica o menor
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int n1, n2;
		try
		{
			System.out.print("\n\t\tVerifica o menor");
			System.out.print("\n\nDigite o 1o numero..:");
			n1 = Integer.parseInt(entrada.readLine());
			System.out.print("\nDigite o 2o numero..:");
			n2 = Integer.parseInt(entrada.readLine());
						
			if (n1>n2){
				System.out.print("\nNumero menor..:"+n2+"\n\n");}
			else{
				if (n1<n2){
				System.out.print("\nNumero menor..:"+n1+"\n\n");}
				else{
					System.out.print("\nNumeros iguais!"+"\n\n");}	
				}
		}
		catch(Exception e)
		{
			System.out.print("\nErro!\n\n");
		}
	}
}