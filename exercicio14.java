package Trabalho;

import java.io.*;
public class exercicio14 //Cargos dos Funcionarios
{
	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int codfunc;
		String aumento, cargo;
		aumento = "";
		cargo = "";
		try
		{
			System.out.print("\n\t\tCargos dos Funcionarios");
			System.out.print("\n\nDigite o codigo do funcionario..:");
			codfunc = Integer.parseInt(entrada.readLine());
			if (codfunc>0 && codfunc<=5){
			if (codfunc ==1){
				cargo = "Escriturario";
				aumento = "50%";}
			if (codfunc ==2){
				cargo = "Secretario";
				aumento = "35%";}
			if (codfunc ==3){
				cargo = "Caixa";
				aumento = "20%";}
			if (codfunc ==4){
				cargo = "Gerente";
				aumento = "10%";}
			if (codfunc ==5){
				cargo = "Diretor";
				aumento = "Nao tem aumento";}
			System.out.print("\nCargo..: "+cargo);
			System.out.print("\n\nAumento de..: "+aumento+"\n\n");
			}
			else{
				System.out.print("\nCódigo inválido");}
		}
		catch(Exception e)
		{
			System.out.print("\nErro!\n\n");
		}
	}
}