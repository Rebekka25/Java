package tutorial.reflection.annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/*
 * Retention muss auf RUNTIME gesetzt werden, ansonsten kann Reflection nicht auf die Annotation zugreifen.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	int value1();
	String value2() default "hallo";
}
