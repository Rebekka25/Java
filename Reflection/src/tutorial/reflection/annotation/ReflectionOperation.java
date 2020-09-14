package tutorial.reflection.annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionOperation {

	public void displayClassInfo() {
		String className = NormalClass.class.getName();
		Method[] methods = NormalClass.class.getMethods();
		Field[] fields = NormalClass.class.getFields();
		
		System.out.println("Gibt den Klassennamen aus: "+ className);
		/*
		 * gibt nur die Methoden zurück die auch public sind
		 */
		System.out.println("Gibt die Anzahl der Methoden aus: "+methods.length);
		/*
		 * gibt nur die Felder zurück die auch public sind
		 */
		System.out.println("Gibt die Anzahl der Felder: "+fields.length);
		
		for(Field field : fields) {
			System.out.println(field.getName());
		}
	}
	

}
