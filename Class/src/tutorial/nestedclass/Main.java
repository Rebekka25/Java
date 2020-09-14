package tutorial.nestedclass;

import tutorial.nestedclass.ExternNestedClass.Class1;
import tutorial.nestedclass.ExternNestedClass.StaticClass1;

/*
 * Es gibt vier verschiedene Arten von innere Klassen
 *statische innere Klasse
 *Mitgliedsklasse
 *lokale Klasse
 *annonyme inner Klass
 *
 */
public class Main {
	public static void main(String[] args) {
		
		ExternNestedClass externNestedClass = new ExternNestedClass();
		// ruft die verschachtelte Klass in der Klasse ExternNestedClass auf
		Class1 class1 = externNestedClass.new Class1();
		class1.displayOtherView();
		// ruft die verschachtelte Klass in der Klasse ExternNestedClass auf
		StaticClass1 staticClass1 = new StaticClass1();
		//sieht displayOtherView weil dies auf public gesetz worden ist
		staticClass1.displayOtherView();
		
		MemberClass memberClass = new MemberClass();
		memberClass.display();
		
	
	
		
		
		

	

	}
	
	
		

}
