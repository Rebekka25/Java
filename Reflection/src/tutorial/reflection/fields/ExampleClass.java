package tutorial.reflection.fields;

public class ExampleClass implements Interface1, Interface2{
	public String field1="";
	private String field2;
	public static String field3;
	String field4;
	public static final String FIELD5="FIELD5";
	
	public ExampleClass(){}
	
	public ExampleClass(String field1) {
		this.field1 = field1;
	}

	public String getField1() {
		return field1;
	}

	public void setField1(String field1) {
		this.field1 = field1;
	}

	public String getField2() {
		return field2;
	}

	public void setField2(String field2) {
		this.field2 = field2;
	}

	public static String getField3() {
		return field3;
	}

	public static void setField3(String field3) {
		ExampleClass.field3 = field3;
	}

	public String getField4() {
		return field4;
	}

	public void setField4(String field4) {
		this.field4 = field4;
	}

	public static String getField5() {
		return FIELD5;
	}
	
	
}
