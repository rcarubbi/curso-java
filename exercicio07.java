package Trabalho;

import java.io.*;
public class exercicio07 //Categoria do Nadador
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int idade;
		String categoria;
		categoria = "";
		try
		{
			System.out.print("\n\t\tCategoria do Nadador");
			System.out.print("\n\nDigite a idade..:");
			idade = Integer.parseInt(entrada.readLine());
			if (idade>18){
				categoria = "Senior";}			
			else{
				if (idade >= 14){
				categoria = "Juvenil B";}
				else{
					if (idade>=11){
					categoria = "Juvenil A";}
					else{
						if (idade>=8){
						categoria = "Infantil B";}
						else{
							if (idade>=5){
							categoria = "Infantil A";}
							else{
							categoria = "Menor de 5 anos não tem categoria";}
						}
					}
				}
			}
			
		System.out.print("\nCategoria..: "+categoria+"\n\n");	
		}
		catch(Exception e)
		{
			System.out.println("\nErro!\n\n");
		}
	}
}
	