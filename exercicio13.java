package Trabalho;

import java.io.*;
public class exercicio13 //Faixa Etaria
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int idade;
		String fetaria;
		fetaria = "";
		try
		{
			System.out.print("\n\t\tFaixa Etaria");
			System.out.print("\n\nDigite a idade..:");
			idade = Integer.parseInt(entrada.readLine());
			if (idade>=0){
			if (idade >= 0 && idade <=2){
				fetaria = "Recem-nascido";}
			else{if (idade <=11){
				fetaria = "Crianca";}
			else{if(idade <=19){
				fetaria = "Adolescente";}
			else{if(idade<=55){
				fetaria = "Adulto";}
			else{
				fetaria = "Idoso";
			}}}}
			System.out.print("\nFaixa Etaria..: "+fetaria);
			}
			else{
				System.out.print("\nA idade deve ser um valor positivo!");
			}
		}
		catch(Exception e)
		{
			System.out.print("\nErro!\n\n");
		}
	}
}