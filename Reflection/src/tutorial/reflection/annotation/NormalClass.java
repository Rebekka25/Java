package tutorial.reflection.annotation;

public class NormalClass {

	public int value1;
	private String value2;
	static int value3;
	/*
	 * durch final static ist es eine Konstante und Konstanten werden immer Groﬂ geschrieben
	 */
	private final static boolean VALUE4 = true;
	
	/*
	 * Das ist der Default Konstruktor, wenn kein anderer Konstruktor definiert ist,
	 * ist dieser der Standart und muss nicht angegeben werden.
	 * Nur bei einem Weiteren Konstruktor, aber nicht zwingend nur wenn man ihn braucht.
	 */
	 
	NormalClass() {}
	 
	NormalClass(int value1, String value2, int value3){
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
	}
	
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	
	public String getValue2() {
		return value2;
	}
}
