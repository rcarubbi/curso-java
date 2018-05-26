package Trabalho;

import java.io.*;
public class exercicio03 //Senha de acesso
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		String senha; 
		try
		{
			System.out.print("\n\t\tSenha de Acesso");
			System.out.print("\n\nDigite a senha..:");
			senha = entrada.readLine();
			
			          
			if (senha.equals("ASDFG"))
				System.out.print("\nAcesso Permitido!\n\n");
			else
				System.out.print("\nAcesso Negado!\n\n");
		}
		catch(Exception e)
		{
			System.out.println("\nErro!\n\n");
		}
	}
}