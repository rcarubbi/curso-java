package Trabalho;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exercicio20 { // equacao do 2o grau

	public static void main(String[] args)
	{
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		double a,b,c,x1,x2,delta;
		try
		{
			System.out.print("\n\t\tEquacao do 2o grau");
			System.out.print("\n\nDigite um valor para A..:");
			a = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite um valor para B..:");
			b = Double.parseDouble(entrada.readLine());
			System.out.print("\nDigite um valor para C..:");
			c = Double.parseDouble(entrada.readLine());
			if (a!=0){
				delta = Math.pow(b,2)-4*a*c;
				if (delta>=0){
					if (delta==0){
						x1=x2= (-b+Math.sqrt(delta))/(2*a);
						System.out.print("\nX1 = "+x1);
						System.out.print("\nX2 = "+x2);}
					else{
						x1 = (-b+Math.sqrt(delta))/(2*a);
						x2 = (-b-Math.sqrt(delta))/(2*a);
						System.out.print("\nX1 = "+x1);
						System.out.print("\nX2 = "+x2);
						}
					}
				else{
					System.out.print("\nSem raizes!");}	
				}
				else{
					System.out.print("\nO valor A deve ser diferente de 0");}	
				
		}
		catch(Exception e)
		{
			System.out.print("\nErro!\n\n");
		}
	}
}