/*
 * nutzvoll bei einen beschränkten Wertebereich
 * Der Compiler setzt Enum in Klassen um, und dort wird jeder
 * Wert in ein static final Feld Umgesetzt:
 * 
 * public class Month{
 * public static final Year JABUARY = new YEAR("JANUARY",0);
 * ....
 * private Year(String s, int i){
 * 	super(s,i);
 * }....
 * }
 * 
 * Enum können in eine anderen Klasse definiert werden, siehe das Java Project Class
 * über das Thema innere Klassen
 * 
 * enum enthalten von der Object Klasse die Methoden: equalse, toString, compateTo,...(wird in der Oberklasse java.lang.Enum überschrieben)
 * enum besiztzen aber kein clone Methode von Cloneable
 * 
 * Es gibt aber noch zusätzliche Klassen die von der Oberklasse java.lang.Enum kommen wir ordinal
 */
public enum Month {


	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY,
	AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	
	static {
		System.out.println("statische Initialisier.");
	}

	public static void displaySummerTime() {
		System.out.println(JUNE +" "+JULY +" "+ AUGUST);
		
	}
	public  void displayWinterTime() {
		System.out.println(DECEMBER +" "+JANUARY +" "+ FEBRUARY);
		
	}
	Month(){}//Konstruktoren in Enu sind immer automatisch private
	
	//Überchreibt die Methode toString()
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "JUNE";
//	}
	/*
	 * überladen der Methode toString
	 */
	public String toString() {
		return "JUNE";
	}
	
	
	public Month displayMonth(){
		if(this == JUNE)
			return JUNE;
		else {
			return this;
		}
	}
	
	{
		System.out.println("Hallo");
	}
}
