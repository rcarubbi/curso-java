package Trabalho;

import java.io.*;

public class exercicio16 { // Companhia de Seguros
	
	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int idade, codseg;
		String grupo;
		try
		{
			System.out.print("\n\t\tCompanhia de seguros");
			System.out.print("\n\nDigite a idade da pessoa..:");
			idade = Integer.parseInt(entrada.readLine());
				
			if (idade >= 18 && idade <= 70){
				System.out.print("\nDigite o Grupo de Risco  ([a]lto, [m]edio, ou [b]aixo)..:");
				grupo = entrada.readLine();
				if (idade <=24){ // primeira faixa etaria
					if (grupo.equals("a")){
						codseg = 9;
					}
					else{
						if (grupo.equals("m")){
							codseg = 8;
						}
						else{
							codseg = 7;
						}
					}
				}
				else {
					if (idade <=40){ // segunda faixa etaria
						if (grupo.equals("a")){
							codseg = 6;
						}
						else{
							if (grupo.equals("m")){
								codseg = 5;
							}
							else{
								codseg = 4;
							}
						}
					}
					else{ // terceira faixa etaria 
						if (grupo.equals("a")){
							codseg = 3;
						}
						else{
							if (grupo.equals("m")){
								codseg = 2;
							}
							else{
								codseg = 1;
							}
						}
					}
				}
				System.out.print("\nCódigo do seguro..: "+codseg);
			}
			else{
				System.out.print("\nEsta pessoa não pode adquirir apolices de seguro!");
			}
		}
		catch (Exception e){
			System.out.print("Erro!");
		}
		
	}

}
