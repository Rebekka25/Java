package tutorial.reflection.annotation;
@MyAnnotation(value1 = 1)
public class ClassWithAnnotationen {
	@MyAnnotation(value1=3, value2="NuerWert")
	int wert;
	
	@MyAnnotation2(value1 = 3, value2 = 9)
	public void display(@MyAnnotation(value1=0 )int param) {}
}
