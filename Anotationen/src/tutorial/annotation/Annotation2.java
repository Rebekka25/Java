package tutorial.annotation;
/*
 * Anotation die keine Methode besitzen, hei�en Marker Anotation
 * Annotationen k�nnen von Reflection in der Laufzeit bearbeitet werden, oder
 * in der Kompilierungszeit von einem Pre-Compiler-Tools
 * Der Compiler erstellt ein Interface
 * 
 * public interface Anotation2 extends Annotation
 * 	public abstract Weekend valueAnotation2();
 * 
 * 
 * Anotationen k�nnen mit Reflection ausgewertet werden.
 */
 public @interface Annotation2 {
	 Weekend valueAnotation2();
}
