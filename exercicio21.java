package Trabalho;

import java.io.*;

public class exercicio21 {

	
	public static void main(String[] args) { // Conta vogais
	
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		String frase="",letra="";
		int x,cont=0;
		try
		{
			System.out.print("\n\t\tContador de vogais");
			System.out.print("\n\nDigite uma frase..:");
			frase = entrada.readLine();
			for (x=0;x<=frase.length()-1;x++)
			{
				letra = frase.substring(x,x+1);
				if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u")){		
				cont+=1;
				}
			}
			System.out.print("Numero de vogais..:"+cont);
		}
		catch (Exception e)
		{System.out.print("Erro!");}
			
	}

}