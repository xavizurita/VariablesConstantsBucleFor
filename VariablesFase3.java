public class VariablesFase3 {

	public static void main(String[] args) {
		
		int AnyTraspas = 1948;
		int AnyNaixement = 1967; 
		int bucle = AnyNaixement - AnyTraspas;
		int VariableAnyTraspas = 0;
		int resultat = 0;
		int NoTraspas = 0;
		resultat = AnyNaixement%4;
		boolean ConfirmacioAny=true;
		System.out.println("Año inicio: " + AnyTraspas + " -- Año nacimiento: " + AnyNaixement);
						
		if (resultat == 0) {
			ConfirmacioAny=true;
		} else {	
			ConfirmacioAny=false;
		}
		
		if (ConfirmacioAny == true) {
			 String afirmatiu ="Año nacimiento fue Bisiesto: ";
			System.out.println(afirmatiu);
		} else {
			String noafirmatiu ="Año nacimiento NO fue Bisiesto: ";
			System.out.println(noafirmatiu);
		}
			
		for (int inici = 0; inici<=bucle; ++inici) {
			resultat = (AnyTraspas + inici)%4;
			
			if (resultat == 1 || resultat == 2 || resultat == 3) {  
				NoTraspas = ++NoTraspas;
			 } else {
				VariableAnyTraspas= ++VariableAnyTraspas;
				System.out.println("Año Bisiesto: " + (AnyTraspas + inici));
			 }
			
			}

	}

}
