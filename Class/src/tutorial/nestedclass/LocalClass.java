package tutorial.nestedclass;
/*
 * Lokale Klassen werden in Methoden, Konstruktoren, etc. definiert
 * Lokale Interfaces gibt es nicht. 
 */
public class LocalClass {
	public String nachname;
	public static String vorname;
	private int age;
	private static String straße;
	String ort;
	static String plz;
	
	public  void display() {
		class NestedClass{
			private String name;
			// static int zahl = 4; kann nicht static deklarieren
			protected String vorname;
			public void display() {}
			
		}
		NestedClass nestedClass = new NestedClass();
		System.out.println(nestedClass.name+"   LocalClass.name geht nicht da es nicht static ist  "+nachname);//direkter Zugriff auf die Felder der Äußeren Klasse
		
	}

}
