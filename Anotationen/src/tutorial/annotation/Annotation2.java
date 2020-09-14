package tutorial.annotation;
/*
 * Anotation die keine Methode besitzen, heißen Marker Anotation
 * Annotationen können von Reflection in der Laufzeit bearbeitet werden, oder
 * in der Kompilierungszeit von einem Pre-Compiler-Tools
 * Der Compiler erstellt ein Interface
 * 
 * public interface Anotation2 extends Annotation
 * 	public abstract Weekend valueAnotation2();
 * 
 * 
 * Anotationen können mit Reflection ausgewertet werden.
 */
 public @interface Annotation2 {
	 Weekend valueAnotation2();
}
