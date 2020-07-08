
public class VariablesFase2 {

	public static void main(String[] args) {
		
		final int AnyTraspas = 1948;
		final int AnyNaixement = 1967; 
		int bucle = AnyNaixement - AnyTraspas;
		int VariableAnyTraspas = 0;
		int resultat = 0;
		int NoTraspas = 0;
		
		System.out.println("Año inicio: " + AnyTraspas + " -- Año nacimiento: " + AnyNaixement);
							
		for (int inici = 0; inici<=bucle; ++inici) {
			resultat = (AnyTraspas + inici)%4;
			
			if (resultat == 1 || resultat == 2 || resultat == 3) {  
				NoTraspas = ++NoTraspas;
								
			 } else {
				 
				VariableAnyTraspas= ++VariableAnyTraspas;
						
			 }
			}

		System.out.println("Años Bisiestos: " + VariableAnyTraspas);
		System.out.println("Años NO Bisiestos: " + NoTraspas);	
		
		

	}

}
