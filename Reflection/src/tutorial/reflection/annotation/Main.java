package tutorial.reflection.annotation;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import java.lang.reflect.Field;


/*
 * In diesem Thema schauen wir uns an, wie wir Reflection benützen können um 
 * Annotationen auszuwerten.
 */
public class Main {

	public static void main(String[] args) {

	
		displayAnnotation();
		System.out.println();
		System.out.println();
		displayFieldsWithMyAnnotation();
		System.out.println();
		System.out.println();
		displayMethodsWithMyAnnotation2();
		System.out.println();
		System.out.println("Refletion die Information zur Klasse NomalClass aus gibt:");
		System.out.println();
		ReflectionOperation reflectionOperation = new ReflectionOperation();
		reflectionOperation.displayClassInfo();
		
		
	}
	

	static void displayAnnotation() {
		
	Annotation[] annotations =ClassWithAnnotationen.class.getAnnotations();
		
		System.out.println("länge von annotations "+annotations.length);
		
		for(Annotation annotation : annotations) {
			if(annotation instanceof MyAnnotation) {
				MyAnnotation myAnnotation = (MyAnnotation) annotation;
				System.out.println("gibt den value2 aus: "+myAnnotation.value2());
			}
			
		}
		}
	
static void displayFieldsWithMyAnnotation() {
		
	Field[] fields = ClassWithAnnotationen.class.getDeclaredFields();
	System.out.println("Länge: "+ fields.length);
	for(Field field: fields) {
		if(field.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
			System.out.println("Gibt den Feldnamen der mit der Annotation MyAnnotation2 deklariert wurde aus: "+field.getName());
			System.out.println(myAnnotation.value2());
		}
	}
	}
	
	static void displayMethodsWithMyAnnotation2() {
		
		Method[] methods = ClassWithAnnotationen.class.getMethods();
		
		System.out.println("Anzahl der Methoden "+methods.length);
		for(Method method : methods) {
			
			if(method.isAnnotationPresent(MyAnnotation2.class)) {
				
				MyAnnotation2 myAnnotation2 = method.getAnnotation(MyAnnotation2.class);
				System.out.println("Methodennamen: "+method.getName());
				System.out.println("Gibt den value1 Wert zurück, der in der ClassWithAnnotationen definiert wurde: "+myAnnotation2.value1());
				/*
				 * Klammer nicht vergessen, sonst werden sie einfach als string dran gehängt und es kommt 39 raus!!
				 */
				System.out.println("value1 und value2 von MyAnnotaion werden zusammen gerechnet "+(myAnnotation2.value1()+myAnnotation2.value2()));
			}
			System.out.println("Gibt jede eizelne Methode zurück "+method.getName());
		}
		
		
		
	}

}
