package tutorial.annotation;
import java.lang.reflect.Method;


/*
 * Es gibt die Möglichkeit eigene Anotationen zu definieren.
 * Es gibt Anotationen mit und ohne Attribute
 */
public class Main {
	//Würde ein Fehler schmeißen, da die Variable Global und nicht local ist
//	@Anotation(value="Wert",value3 = @Anotation2(valueAnotation2 = Weekend.MONDAY) ,value4 = {"Wert1","Wert2"})//So kann es auch definiert werden
//	String localVariable;
	/*
	 * nur weil in Anotation die value() Methode drin steht müssen wir ein Attribut hinzufügen
	 */
//	@Anotation("Wert") //kann aber nur ohne value stehen solange es nur ein Attribut existiert
	public static void main(String[] args) {
		@Annotation(value="Wert",value3 = @Annotation2(valueAnotation2 = Weekend.MONDAY) ,value4 = {"Wert1","Wert2"})//So kann es auch definiert werden
		String localVariable;
		//berprüft ob es eine Anotaion ist
		System.out.println(ClassA.class.isAnnotation());
		System.out.println(Annotation.class.isAnnotation());
		System.out.println(Annotation.class.getAnnotations().length);
		System.out.println("Present "+Annotation.class.isAnnotationPresent(Annotation2.class));
		System.out.println(ClassA.class.getAnnotations().length);
		System.out.println(ClassA.class.getDeclaredAnnotations().length);
		
		Method[] methods = ClassA.class.getMethods();
		System.out.println("Anzahl der Methoden "+methods.length);
		for(Method method : methods) {
			if(method.isAnnotationPresent(Annotation.class)) {
				Annotation anotation = method.getAnnotation(Annotation.class);
				System.out.println("Methodennamen: "+method.getName());
				System.out.println("Gibt den value5 Wert zurück, der in der ClassA definiert wurde: "+anotation.value5());
			}
		}
	}
	

}
