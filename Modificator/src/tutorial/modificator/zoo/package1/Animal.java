package tutorial.modificator.zoo.package1;

public interface Animal {
	int index=1;//können Felder angelegt werden.
	//protected kann bei einem Interface nicht das Modificator
	public void animalSpecies();
	void animalSound();
	/*
	 * Seit Java8 lassen sich auch Methoden in Interfaces implementieren
	 */
	private float animalSize() {
		return 10;
	}
}
