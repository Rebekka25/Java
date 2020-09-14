package tutorial.nestedclass;
/*
 * Beispiel f¸r eine Statische innere Klasse oder auch statische Mitgliedsklassen bezeichnet 
 */
public class StaticInnerClass {
	public String nachname="Max";
	public static String vorname="Mustermann";
	private int age=30;
	private static String straﬂe="FakeStraﬂe";
	String ort="FakeOrt";
	static String plz="74564";
	
	public static void display() {
		//Kann direkt auf die Felder Zugreifen, die mit static deklariert ist
		System.out.println(NestedStaticClass.plz);
		//kann auch auf Felder Zugreifen die static und private sind 
		System.out.println(NestedStaticClass.straﬂe);
		System.out.println(NestedStaticClass.vorname);
		NestedStaticClass nestedStaticClass = new NestedStaticClass();
		//mit den Objekt greifen
		System.out.println(nestedStaticClass.age);
		System.out.println(NestedFinalClass.straﬂe);
		System.out.println(NestedPrivateClass.straﬂe);
		
	}
	public void displayOther() {
		NestedFinalClass nestedFinalClass = new NestedFinalClass();
		System.out.println("gibt ein Feld aus der NestedFinalClass aus "+nestedFinalClass.age);
	}
	
	static class NestedStaticClass{
		public String nachname="Bernd";
		public static String vorname="Schmid";
		private int age=40;
		private static String straﬂe="BerndStraﬂe";
		String ort="BerndOrt";
		static String plz="74564";
		/* 
		 * private sind auch von der ƒuﬂen Klasse sichtbar
		 */
		private static int zahl2 = 4;
		public void display() {
			System.out.println("Bin in einer verschachtelten static Klasse drin");
		}
		
	}
	
	private static  class NestedPrivateClass{
		public String nachname="Bernd";
		public static String vorname="Schmid";
		private int age=40;
		private static String straﬂe="BerndStraﬂe";
		String ort="BerndOrt";
		static String plz="74564";
	
		private static int zahl2 = 4;
		
	}
	
	/*
	 * final Klassen bedeuten, dass von ihr keine Unterklasse abgeleitet werden.
	 */
	final  static class NestedFinalClass{
		public String nachname="Bernd";
		public static String vorname="Schmid";
		private int age=40;
		private static String straﬂe="BerndStraﬂe";
		String ort="BerndOrt";
		static String plz="74564";
	
		private static int zahl2 = 4;
		
}
}
