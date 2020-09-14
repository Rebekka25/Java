package tutorial.lambdas;

import java.util.HashMap;
import java.util.Map;
/*
 * Lambdasa gibt es seit Java 8
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperations arithmeticOperations = new ArithmeticOperations() {
			
			public int plus(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		arithmeticOperations.plus(3, 4);
		ArithmeticOperations rechenart = (int a, int b) -> a+b;
		ArithmeticOperations rechenart2 = ( a,  b) -> a+b;
		System.out.println(rechenart.plus(1, 2));
		System.out.println(arithmeticOperations.plus(3, 4));
		
	
	}

}
