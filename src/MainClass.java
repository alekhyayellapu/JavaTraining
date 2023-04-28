import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter 1st number");
		int number1 = BasicInputClass.readInteger();
		
		System.out.println("Enter 2nd number");
		int number2 = BasicInputClass.readInteger();
		
		int i = MenuClass.menu();
		
		MathsOperators m = new MathsOperators();
		
		if(i==1){
			m.add(number1, number2);
		}else if(i==2) {
			m.subtract(number1, number2);
		}else if(i==3) {
			m.multiply(number1, number2);
		}else if(i==4) {
			m.divide(number1, number2);
		}else if(i==5) {
			m.square(number2);
		}else if(i==6) {
			m.cube(number1);
		}else {
			System.out.println("Please enter valid number ");
			MenuClass.menu();
		}
		
		
		
		
	}

}

