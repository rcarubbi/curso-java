package Trabalho;

import java.io.*;
public class exercicio08 //Média Ponderada
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		double n1,n2,n3,media;
		String conceito;
		conceito = "";
		try
		{
			System.out.print("\n\t\tMedia Ponderada");
			System.out.print("\n\nDigite a Nota de Laboratorio..:");
			n1 = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite a Nota de Avaliacao Semestral..:");
			n2 = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite a Nota de Exame Final..:");
			n3 = Double.parseDouble(entrada.readLine());
			if ((n1<=10 && n1>=0)&&(n2<=10 && n2>=0)&&(n3<=10 && n3>=0)){
				media = n1*0.2+n2*0.3+n3*0.5;
				System.out.print("\nMedia Final..: "+media);
				if (media<5){
					conceito = "E";}			
				else{
					if (media <6){
						conceito = "D";}
					else{
						if (media <7){
							conceito = "C";}
						else{
							if (media <8){
								conceito = "B";}
							else{
								if (media <=10){
									conceito = "A";}
								}
							}
						}
					}
				System.out.print("\n\nConceito..: "+conceito+"\n\n");
			}
			else
				System.out.print("\nInsira notas de zero a dez!\n\n");
		}
		catch(Exception e)
		{
			System.out.println("\nErro!\n\n");
		}
	}
}