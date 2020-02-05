/*  ●	Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
	●	Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
	●	Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
	●	Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.*/

package variables;

public class StageOne {
	public static void main(String[]args) {
		
		String name = "Daniel";
		String surname1="Fernández";
		String surname2= "Fiano";
		int day = 31;
		int month = 01;
		int year = 2020;
		System.out.println("My first surname is " + surname1 + " My second surname is " + surname2 + " My name is " + name);
		System.out.println(day+ "/" +month+ "/" +year);
		
		
	}
}
