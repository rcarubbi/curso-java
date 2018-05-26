package Trabalho;

import java.io.*;
public class exercicio12 //Media aritmetica
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		double media, n1, n2, n3;
		try
		{
			System.out.print("\n\t\tMedia aritmetica");
			System.out.print("\n\nDigite a 1a nota..:");
			n1 = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite a 2a nota..:");
			n2 = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite a 3a nota..:");
			n3 = Double.parseDouble(entrada.readLine());
			if ((n1<=10 && n1>=0)&&(n2<=10 && n2>=0)&&(n3<=10 && n3>=0)){
				media = (n1+n2+n3)/3;	
				if (media <5){
					System.out.print("\nReprovado!");}
				else{
					if (media<7){
						System.out.print("\nExame");}
					else {
						System.out.print("\nAprovado!");}
					}
				System.out.print("\n\nMedia Final..: "+media);
				}
			else{  // notas invalidas
				System.out.print("\nInsira notas de zero a dez!");
			}
		}
		catch(Exception e)
		{
			System.out.print("\nErro!\n\n");
		}
	}
}