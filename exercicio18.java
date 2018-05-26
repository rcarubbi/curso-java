package exercicios;
import java.io.*;

public class exercicio18 { // Gratificação de natal
	
		public static void main(String[] args)
		{
			BufferedReader entrada;
			entrada = new BufferedReader(new InputStreamReader(System.in));
			double he, hf, h,premio, heh, hfh,hem,hfm;
			try{
				System.out.print("\n\t\tGratificacao de Natal");
				System.out.print("\n\n\t\tDigite o numero de horas extras em minutos..: ");
				he=Double.parseDouble(entrada.readLine());
				System.out.print("\n\t\tDigite o numero de horas de faltas em minutos..: ");
				hf=Double.parseDouble(entrada.readLine());
				h=he-((double)2/(double)3*hf);
								
				if (h>0){
					if (h>2400){
						premio=500;
					}
					else if (h>1800){
						premio=400;
					}
					else if (h>1200){
						premio=300;
					}
					else if (h>600){
						premio=200;
					}
					else{
						premio=100;
					}
				}
				else {premio=0;}
				heh=(int)(he/60);
				hfh=(int)(hf/60);
				hem=he%60;
				hfm=hf%60;
				System.out.print("\n\t\tPremio..: R$"+premio);
				System.out.print("\n\t\tHoras extras..: "+heh+" h");
				if (hem>0){
				System.out.print(" e "+hem+" min");	
				}
				if (hfh>=0){
				System.out.print("\n\t\tHoras de faltas..: "+hfh+ " h");
				if (hfm>0){
				System.out.print(" e "+hfm+" min");	
				}
				}
				
				
					
			}
			catch(Exception e)
			{
				System.out.print("\n\t\tErro!");
			}
			
		}
			
			
}
