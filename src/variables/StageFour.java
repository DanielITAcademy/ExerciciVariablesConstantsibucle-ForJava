/*●	Creeu una variable on juntareu el nom i els cognoms (tot en una variable) 
i un altre on juntareu la data de naixement separada per “/” (tot en una variable). 
Mostreu per consola les variables del nom complet, la data de naixement 
i si l’any de naixement es de traspàs o no.
Exemple de sortida per consola:
El meu nom és Juan Perez Gonzalez
Vaig néixer el 01/01/1979
El meu any de naixement és de traspàs. */

package variables;

public class StageFour {
	public static void main(String[]args) {
		//variable nombre y apellido
		String name = "Daniel";
		String surname="Fernández Fiaño";
		String total= name + surname;
		System.out.println("My name is " + total);
		//variable fecha de nacimiento
		int day = 07;
		int month = 9;
		int year = 1984;
		
		String born = day+"/"+month+"/"+year;
		
		System.out.println("My date of birthday is "+born);
		
		// ¿Es bisiesto?
	
	
			      if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ) {
			         System.out.println( "My year is " + year + " is leap");
			      }
			      else {
			         System.out.println( "My year" + year + "is not leap");
			      }      
			   }
				
}
