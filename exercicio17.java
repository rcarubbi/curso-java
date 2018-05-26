package Trabalho;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class exercicio17 { // Quadrante do angulo

	public static void main(String[] args) {
		BufferedReader entrada;
		entrada = new BufferedReader(new InputStreamReader(System.in));
		int angulo;
		String quad="";
		
		try
		{
			System.out.print("\n\t\tQuadrante do angulo");
			System.out.print("\n\nDigite o angulo..:");
			angulo = Integer.parseInt(entrada.readLine());
			if (angulo>360 || angulo<0){
				angulo = angulo%360;
			}
			
			if (Math.abs(angulo)<90){
				quad = "1o Quadrante";
			}				
			else{
				if(Math.abs(angulo)<180){
					quad = "2o Quadrante";					
				}
				else{
					if (Math.abs(angulo)<270){
						quad = "3o Quadrante";
					}
					else{
						quad = "4o Quadrante";
					}
				}
	
			}
			System.out.print("\nPosicao...: "+quad);
		}
		
		catch (Exception e){
			System.out.print("Erro!");
		}	
	}

}
