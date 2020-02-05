/*  ●	Partint de l’any 1948 heu de fer un bucle for i mostrar els anys de traspàs fins 
 arriba al vostre any de naixement. (0,75 punts)
ATENCIO! Haureu de canviar el tipus de variable de l’any 1948 per poder modificar-la. 
	●	Creeu una variable bool que sera certa si l’any de naixement és de traspàs o falsa
	 si no ho és.(0,75 punts)
	●	En cas de que la variable bool sigui certa, heu de mostrar per consola una frase
on ho digui, en cas de ser falsa mostrareu la frase pertinent. 
Creeu dues variables string per guardar les frases. (1,5 punts)*/



package variables;
import java.util.Scanner;
public class StageThree {
	
	static final int year = 1948;
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int yearInterval= 4;
		
		System.out.println("Insert year of birth");
		int birthYear = sc.nextInt();
		
		boolean leap=false;
		String a ="This is a leap year";
		String b="This is not a leap year";
		
		for(int i=1948; i<=birthYear; i++) {
			if((i % yearInterval == 0 && ((i % 100 != 0) || i % 400 ==0))) {
				System.out.println("" + i);
				leap= true;
				
				System.out.println( a);
				
				}else {
					
				leap = false;
					System.out.println(b);
					
				
				}
				
			} 
				
		
	}

}
