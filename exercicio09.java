package Trabalho;

import java.io.*;
public class exercicio09 //Procedencia de produto
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int codprod;
		double preco;
		String procprod;
		procprod = "";
		try
		{
			System.out.print("\n\t\tProcedencia de produto");
			System.out.print("\n\nDigite o valor do produto..: R$");
			preco = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite o codigo do produto..:");
			codprod = Integer.parseInt(entrada.readLine());
			if (codprod==1){
					procprod="Sul";}			
				else{
					if (codprod==2){
						procprod="Norte";}			
					else{
						if (codprod==3){
							procprod="Leste";}			
						else{
							if (codprod==4){
								procprod="Oeste";}			
							else{
								if (codprod<=6){
									procprod="Nordeste";}
								else{
									if (codprod<=9){
										procprod="Sudeste";}
									else{
										if (codprod<=20){
											procprod="Centro-oeste";}
										else{
											if (codprod<=30){
												procprod="Nordeste";}
											else
												procprod="Regiao nao cadastrada!";
											}
										}
									}
									
								}
							}
						}
					}
				System.out.print("\nProcedencia..: "+procprod+"\n\n");
			
		}
		catch(Exception e)
		{
			System.out.print("\nErro!\n\n");
		}
	}
}