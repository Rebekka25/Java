package tutorial.reflection.fields;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ExampleClass exampleClass = new ExampleClass();
//		displayClassInfo();
		displayFieldInfo();
	}
	
	public static void displayFieldInfo() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		/*
		 * Gibt die Felder der Klasse ExampleClass zurück, aber nur die jenigen die public sind.
		 */
		Field[] fields = ExampleClass.class.getFields();
		System.out.println("Ausgabe der Felder von der Klasse ExampleClass");
		//ForEach Schleife
		for(Field field : fields) {
			System.out.println(field);
		}
		/*
		 * Mit der Methode getDeclaredFields() bekommen wir jedes Feld aus der Klasse ExampleClass zurück.
		 */
		Field[] fields2 = ExampleClass.class.getDeclaredFields();
		//Eine ander Möglichkeit außer mit der for- und der forEach-Schleife
		//durch die Benutztung von Streams können wir Lambdas ausdrücke verwenden.
		Arrays.stream(fields2).forEach(System.out::println); 
		System.out.println();
		System.out.println("Mit getField(name des Feldes) können wir ein ganz bestimmtes Feld aufrufen");
		//NoSuchFieldException wird geworfen wenn dieser Feld nicht existiert
		System.out.println(ExampleClass.class.getField("field1"));
		Field field1 = ExampleClass.class.getField("field1");
		//Gibt den Namen des Feldes zurück
		System.out.println("field.getName() "+field1.getName());
		//Gibt den Type raus, sprich ob es String, int oder ein anderen
		System.out.println("field.getType() "+field1.getType());
		System.out.println();
		ExampleClass exampleClass = new ExampleClass();
		//Geht aber nicht bei Modificator final oder private
		field1.set(exampleClass, "Field1");
		
		System.out.println(exampleClass.getField1());

		
	}
	
	public static void displayClassInfo() {
		
		/*
		 * ExampleClass.class.getName() Klassennamen mit package
		 * ExampleClass.class.getSimpleName() nur den Klassennamen
		 * 
		 */
		System.out.println(ExampleClass.class.getName()+"       "+ExampleClass.class.getSimpleName());
		System.out.println(ExampleClass.class.getModifiers());
		System.out.println(ExampleClass.class.getPackageName());
		System.out.println(ExampleClass.class.getPackage());
		
		System.out.println(ExampleClass.class.getSuperclass());
		System.out.println();
		System.out.println("Gibt an welche Interfaces die ExampleClass implementiert:");
		for(int i =0; i<ExampleClass.class.getInterfaces().length;i++) {
			System.out.println(ExampleClass.class.getInterfaces()[i]);
		}
		System.out.println();
		System.out.println("Gibt die Konatruktor von ExampleClass aus: ");
		Constructor[] constructors = ExampleClass.class.getConstructors();
		//for-Schleife
		for(Constructor constructor: constructors) {
			System.out.println(constructor.toString());
		}
	}

}
