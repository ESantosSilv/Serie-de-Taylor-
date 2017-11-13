package prueba;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;



public class Taylor {
	public static void main (String[]args) throws NumberFormatException, IOException 
	{
		
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
		//Numbers size
			bw.write( "Serie de Taylor "+ serie_taylor(90)  + "\n");
			bw.write( "Serie de Taylor "+ serie_taylor (2) + "\n");
			bw.flush() ;
		
	}
	
	private static double serie_taylor (int x ) 
	{
		//Acumulator
		double acum = 0.0;
	
		
		for (int i = 0 ; i <= 50 ; i ++ ) 
		{
			
			int potencia = 0;
			acum += ( potencia ((-1),i) * potencia (x,(2*i)+1)) / factorial((2*i) + 1);
		}
		
		return acum; 
	}

	                                                                                                                                                              
	private static int factorial(int i)
	{
		return ((2*i) + 1);
	}

	private static int potencia(double x, int i) {
		double potencia = 1;
		for(int j = 0; j< i ; j++)
		{
			potencia *= x;
		}
		return (int) potencia;
	}



}
