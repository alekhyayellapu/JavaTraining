
public class MainClass {

	public static void main(String[] args) {

		int a = 90;
		int b = 35;
		int c = 32;
		MathsOperators m = new MathsOperators();
		m.add(a, b, c);
		m.subtract(a, b, c);
		m.multiply(a, b, c);
		m.divide(a, b);
		m.square(a);
		m.cube(b);
	}

}
