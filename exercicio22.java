package Trabalho;

import java.io.*;

public class exercicio22 {

	
	public static void main(String[] args) { // Conta palavras
	
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		String frase="",letra="";
		int x,cont=0;
		try
		{
			System.out.print("\n\t\tContador de palavras");
			System.out.print("\n\nDigite uma frase..:");
			frase = entrada.readLine();
			for (x=0;x<=frase.length()-1;x++)
			{
				letra = frase.substring(x,x+1);
				if (x>0){
					if ((frase.substring(x-1,x).equals(" ")) && !(letra.equals(" "))){
						cont+=1;
					}
				}
				else
				{
					if (!(letra.equals(" ")))
					{
						cont+=1;
					}						
				}
				
			}
			System.out.print("Numero de palavras..:"+(cont));
		}
		catch (Exception e)
		{
		System.out.print("Erro!");
		}
			
	}

}
