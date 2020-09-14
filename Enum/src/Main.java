
public class Main {

	public static void main(String[] args) {
		//Zugriff auf die Enum Werte
		Month month1 = Month.DECEMBER;
		Month month2 = Month.JUNE;
		Month month3 = Month.AUGUST;
		//Können immer null zugeordnet werden, deswegen bei der Benutzung abfragen damit keine NullPointerException geworfen wird.
		
		month2 = null;  
		//gibt den Namen des Wertes auf, ruft standartmäßig die Methode name() auf, toString ist nicht final und somit veränderbar
		System.out.println(month1.toString());
		//Gibt den Namen des Wertes wieder, die Methode ist final und lässt sich nicht mehr verändern
		System.out.println(month1.name());
		//Gibt die Position des Wertes in der Enum wieder und wird bei CompareTo verwendet, als Vergleich
		//sind auch Wichtig für EnumSet und EnumMap
		System.out.println(month1.ordinal());
		System.out.println("month1.compareTo(month3):"+month1.compareTo(month3)+"  month3.compareTo(month1):"+month3.compareTo(month1)+"  month3.compareTo(month3):"+month3.compareTo(month3));
		month1.values().toString();
		System.out.println("month1.values() gibt ein Array zurück(ausgabe hier nur als Refernzwert) "+month1.values());
		System.out.println("month1.values()[1] gibt den Eintrag aus dem Array an der Position 1 zurück: "+month1.values()[1]);
		System.out.println(Month.valueOf("JUNE"));
//		System.out.println(Month.valueOf("JUNEk")); wirft eine IlleagArgumentExcption
		for (Month month: Month.values()) {
			System.out.println("Monat: "+month );
		}
		System.out.println(month1.values().toString());
		Month.displaySummerTime();
		System.out.println("Month.JUNE.displayMonth() "+Month.JUNE.displayMonth());
		System.out.println("Month.APRIL.displayMonth() "+Month.APRIL.displayMonth());
	}

}
