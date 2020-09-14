package tutorial.annotation;

public class ClassA {
	@Annotation2(valueAnotation2 = Weekend.MONDAY)
	int field;
	@Annotation2(valueAnotation2 = Weekend.MONDAY)
	int field2;
	@Annotation(value="Wert",value3 = @Annotation2(valueAnotation2 = Weekend.MONDAY) ,value4 = {"Wert1","Wert2"}, value5 = true)//So kann es auch definiert werden
	public void display() {}
	public void displayOther() {}
}
