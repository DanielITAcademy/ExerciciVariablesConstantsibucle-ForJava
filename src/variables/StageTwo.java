/*  ●	Creeu una constant amb el valor de l’any (1948).
	●	Creeu una variable que guardi cada quan hi ha un any de traspàs.
	●	Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor resultant en una variable.
	●	Mostreu per pantalla el resultat del càlcul.*/


package variables;
import java.util.Scanner;
public class StageTwo {
	
	static final int year = 1948;
	public static void main(String[]args) {
	
		Scanner sc = new Scanner(System.in);
		int yearInterval= 4;
		
		System.out.println("Insert year of birth");
		int birthYear = sc.nextInt();
		int counter=0;
		
		for(int i=1948; i<=birthYear; i++) {
			if((i % yearInterval == 0 && ((i % 100 != 0) || i % 400 ==0))) {
				
				counter++;
				
			
				
				
			} 
			
		};
		
		System.out.println("We have " + counter);
		
		
	
		
		
		
		
	}

}
