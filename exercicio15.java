package Trabalho;

import java.io.*;
public class exercicio15 //Operacoes Matematicas
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		double n1,n2,result;
		String acao="";
		
					
			System.out.print("\n\t\tOperacoes Matematicas");
			System.out.print("\n\t/========================================\\"); 
			System.out.print("\n\t| (S)oma | (R)aiz quadrada | (F)inalizar |");
			System.out.print("\n\t\\========================================/");
			try
			{
				System.out.print("\n\n\tDigite a opcao desejada..:");
				acao = entrada.readLine();
				if (acao.equalsIgnoreCase("S")){
					System.out.print("\n\n\t\t..:: Soma ::..");
					System.out.print("\n\n\tDigite o 1o numero..:");
					n1 = Double.parseDouble(entrada.readLine());
					System.out.print("\n\tDigite o 2o numero..:");
					n2 = Double.parseDouble(entrada.readLine());
					result = n1+n2;
					System.out.print("\n\tResultado..: " + result);
				}
				if (acao.equalsIgnoreCase("R")){
					System.out.print("\n\n\t\t..:: Raiz Quadrada ::..");
					System.out.print("\n\n\tDigite o numero..:");
					n1 = Double.parseDouble(entrada.readLine());
					result = Math.sqrt(n1);
					System.out.print("\n\tResultado..: " + result);
				}	
				if (acao.equalsIgnoreCase("F")){
					System.out.print("\n\tAté logo...");
				}
				if(!(acao.equalsIgnoreCase("S"))&&!(acao.equalsIgnoreCase("R"))&&!(acao.equalsIgnoreCase("F"))){
					System.out.print("\n\tOpçao invalida!");
				}
				
			}
			catch(Exception e)
			{
				System.out.print("\nErro!\n\n");
			}
			
		}
	}
	
