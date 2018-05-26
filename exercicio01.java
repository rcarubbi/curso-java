package Trabalho;
import java.io.*;
public class exercicio01 //média escolar
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		double media, n1, n2, n3 ,n4;
		try
		{
			System.out.print("\n\t\tMedia Escolar");
			System.out.print("\n\nDigite a 1a nota..: ");
			n1 = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite a 2a nota..: ");
			n2 = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite a 3a nota..: ");
			n3 = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite a 4a nota..: ");
			n4 = Double.parseDouble(entrada.readLine());
			media = Math.round((n1+n2+n3+n4)/4);
			System.out.print("\nMedia Final..:"+media+"\n\n");
			if (media >=7)
				System.out.print("Aprovado!\n\n");
			else
				System.out.print("Reprovado\n\n");
		}
		catch(Exception e)
		{
			System.out.println("\nErro!\n\n");
		}
	}
}