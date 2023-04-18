
public class MathsOperators {
	
	public void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.println("Addition of "+a+", "+b+" and "+ c+" : "+result);
	}
	
	public void subtract(int a, int b, int c) {
		int result = a - b - c;
		System.out.println("Subtraction of "+a+", "+b+" and "+ c+" : "+result);
	}
	
	public void multiply(int a, int b, int c) {
		int result = a * b * c;
		System.out.println("Multiplication of "+a+", "+b+" and "+ c+" : "+result);
	}
	
	public void divide(int a, int b) {
		int result = a / b;
		System.out.println("Division of "+a+", "+b+" : "+result);
	}
	
	public void square(int a) {
		int result = a*a;
		System.out.println("Square of "+a+" : "+result);
	}
	
	public void cube(int b) {
		int result = b*b*b;
		System.out.println("Cube of "+b+" : "+result);
	}

}
