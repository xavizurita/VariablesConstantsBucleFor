
public class VariablesFase4 {

	public static void main(String[] args) {
		String NomComplert ="Xavi Zurita Roc ";
		String DataNaixement="14/02/1967 ";
		
		System.out.println("El meu nom és " + NomComplert);
		System.out.println("Vaig néixer el " + DataNaixement);
		
		int AnyNaixement=1967;
		int calcular=AnyNaixement%4;
		
		if (calcular==0) {
			System.out.println("El meu any de naixement és de traspàs");
		} else {
			System.out.println("El meu any de naixement NO és de traspàs");
		}
		
				
				
	}

}
