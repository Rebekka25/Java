package tutorial.nestedclass;

import tutorial.nestedclass.StaticInnerClass.NestedStaticClass;
/*
 * ��ere Klassen k�nnen auf public, final, abstract gesetzt werden
 */
public class MemberClass {
	public String nachname="Max";
	public static String vorname="Mustermann";
	private int age=30;
	private static String stra�e="FakeStra�e";
	String ort="FakeOrt";
	static String plz="74564";
	
	public void display() {
		
		NestedClass nestedClass = new NestedClass();
		NestedPrivateClass nestedPrivateClass = new NestedPrivateClass();
		NestedFinalClass nestedFinalClass = new NestedFinalClass();
		System.out.println(nestedClass.age);
		//so l�sst sich das verhindern dass das Feld der �u�en Klasse verdeckt wird.
		System.out.println("Gibt den Nachname der MemberClass zur�ck  "+MemberClass.this.nachname);
		
		
		
	}
	public static void displayOther() {
		MemberClass memberClass = new MemberClass();
		NestedClass nestedClass = memberClass.new NestedClass();
		NestedPrivateClass nestedPrivateClass = memberClass.new NestedPrivateClass();
		NestedFinalClass nestedFinalClass = memberClass.new NestedFinalClass();
		System.out.println(nestedClass.age);
	}
	
	/*
	 * Innere Klasse kann auf public, protected, private, static, final, abstract gesetzt werden.
	 */
	class NestedClass{
		//Felder der inneren Klasse �berdecken immer die �u�eren
		public String nachname="Bernd";
		private int age=40;
		String ort="BerndOrt";
		/* 
		 * private sind auch von der �u�en Klasse sichtbar
		 */
		public void display() {
			System.out.println("Bin in einer verschachtelten static Klasse drin");
		}
		
	}
	
	private class NestedPrivateClass{
		public String nachname="Bernd";
		//wenn die Klasse nicht static ist, k�nnen wir keine static Felder definieren.
//		public static String vorname="Schmid";
		private int age=40;
//		private static String stra�e="BerndStra�e";
		String ort="BerndOrt";
//		static String plz="74564";
	
//		private static int zahl2 = 4;
		
	}
	
	/*
	 * final Klassen bedeuten, dass von ihr keine Unterklasse abgeleitet werden.
	 */
	final class NestedFinalClass{
		public String nachname="Bernd";
		//Klasse m�sste static sein
//		public static String vorname="Schmid";
		private int age=40;
//		private static String stra�e="BerndStra�e";
		String ort="BerndOrt";
//		static String plz="74564";
	
//		private static int zahl2 = 4;
		
}
	
	/*
	 * kann auch public, protected, static,private und abstract gesetzt werden
	 * nicht auf final
	 */
	 interface NestedInterface{}
	 
	 /*
	  * �u�ere Interfaces k�nnen auf abstract und public gesetzt weren
	  * nicht auf final, private, static und protected
	  */
}
