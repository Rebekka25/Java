package tutorial.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/*
 * Durhc Annotationen ist es m�glich Metadaten den Java-Code zu �bergeben.
 * Hier wird eine Neue Anotation erstellt,
 * wo man die Anotation anwendet ist egal,es gibt noch keine Einschr�nkung dazu.
 * Einsch�nkungen k�nnen mit der Anotation @Target( ) erstellt werden.
 * Es existieren folgende Werte:
 * ElementType.ANNOTATION_TYPE
 * ElementType.TYPE //Normalerweise Interface und Class
 * ElementType.CONSTRUCTOR
 * ElementType.METHOD
 * ElementType.FIELD
 * ElementType.LOCAL_VARIABLE
 * ElementType.PARAMETER
 * ElementType.PACKAGE -> kann in einer Datei mit dem Namen package-info.java verwendet werden. Der Compiler ereugt eine .class-Datei
 * 
 * Mit @Retention l�sst sich bestimmen ob nur der Compiler oder die Laufzeitumgebung es sehen kann
 * Es existieren folgende Werte:
 * RetentionPolicy.SOURCE: nach der Kompilierung steht es nicht mehr zu Verf�gung
 * RetentionPolicy.CLASS: in der .class Datei zu Verf�gung nicht der Laufzeit 
 * RetentionPolicy:RUNTIME steht zur Laufzeit zu Verf�gung
 * 
 * Retention und Target k�nnen nur auf Anotationen angewendet werden
 */
@Target({ElementType.LOCAL_VARIABLE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation {
	/*darf kein void sein, kein throws verwenden und keine Prameter besitzen
	* alle primitive Typen k�nnen verwendet werden 
	*/
	String value();
	/*
	 * Wrapper Klassen k�nnen nicht verwendet werden.
	 */
//	Float value2();
	Annotation2 value3();
	//Enum sint m�glich und Felder von den oberen Type, nur nicht mehr dimensional
	String[] value4();// ist m�glich
	boolean value5() default false;//mit dem default muss value5 nicht in jeder Anotation angegeben werden, wird automatisch so gesetzt
	//so kann man immer ein default werde hinzuf�gen ohne gro�e �nderungen machen zu m�ssen, beim entfernen eines Wertes muss man in jede Klasse oder Interfaces gehen
	//und es anpassen
//	String[][] value6(); ung�ltig
//	ArrayList<String> list(); ung�ltig
	
}
 