import java.util.Scanner;

public class Uppgift1 {

	public static void main(String[] args) {
	
		// Anv�nds f�r att skanna av det som anv�ndaren skriver. Samt g�r s� att anv�ndaren kan skriva.
		Scanner userScanner = new Scanner (System.in); 
		
		// En fr�ga till anv�ndaren.
		System.out.println("Skriv in ett nummer: ");
		
		//Tar in input fr�n anv�ndaren om anv�ndaren om anv�ndaren har skrivit ett haltal.7
		//Sparar som ett heltal.
		int userNumber = userScanner.nextInt(); 
		
		//Kollar om usernumber �r st�rre �n 8 & samtidigt mindre �n 10 eller st�rre �n 33.
		if (userNumber > 8 && userNumber < 10 || userNumber > 33) { 
			// Skriver ut bra till anv�ndaren
			System.out.println("Good");
		} else { 
			//Skriver ut d�ligt till an�ndaren
			System.out.println("Bad"); 
		
			
			
		}
		
		

	}


