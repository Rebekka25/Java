package tutorial.modificator.zoo.package1;

public class Giraffe implements Animal {
	/*
	 * Bei Objekten mit final, ist es die Referenz die einmal gesetzt werden kann
	 * Der Zustand (seine Felder können immer noch verändert werden).
	 */
	public static final Giraffe GIRAFFE1= new Giraffe();
	//bei private ist es nur innerhalb der Klasse sichtbar
	private String tierName;
	//mit public ist es überall Zugreifbar
	public static int countGiraffe = 10; //werden an keinen Objekt gebunden
	/*wenn kein public, private oder protected drin steht, ist es automatisch private package.
	*	bedeutet es ist nur in der Klasse und in allen anderen Klassen im selben package sichtbar
		zudem ist es mit final static auch eine Konstante, dies bedeutet, der Wert der Zueordet ist 
		lässt sich nicht mehr verändern. Standart ist es Konstantenname mit Großbuchstaben zu Bezeichnen.
	*/
	final static int MAX_COUNT_GIRAFFE = 20;
	/*
	 * Sichtbar in der eigenen und allen anderen Klassen im selben Package, wird es abgeleitet ist es auch in der dortigen Klasse sichtbar
	 */
	protected String animalSpecies;
	String animalSound;
	
	@Override
	public void animalSpecies() {
		animalSpecies = "Hunde sind Säugetiere";
		System.out.println("Hunde sind Säugetiere");
	}

	@Override
	public void animalSound() {
		animalSound ="Wow wow";
		System.out.println("Wow wow");		
	}
	/*
	 * Der Vorteil bei setter Methoden ist es Einschränkungen zu definieren, damit nicht jeder Wert gesetzt werden kann.
	 * Es könnten Ausnahmen existieren, deren Feldwerte nicht besitzen dürfen. Es kann auch gellogt oder mit einer Exception gemeldet werden.
	 * Automatische generierung von Getter- und Setter-Methoden: In Kontextmenü rein gehen Source -> Generate Getters und Setters... -> öffnet ein Dialogfenster
	 *  
	 */
	public String setTierName() {
		return tierName;
	}
	void getTierName() {
		System.out.println("Der Tiername lautet "+tierName);
	}


}
