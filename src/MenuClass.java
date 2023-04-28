import java.io.IOException;

public class MenuClass {
	
	public static int menu() throws IOException {
		System.out.println("\nMenu for Mathematical Operations: ");
		System.out.println("1. Add\n"
				+ "2. Subtract\n3. Multiply\n4. Divide\n5. Square\n6. Cube");
		System.out.print("Please enter your choice: ");
		int i = BasicInputClass.readInteger();
		return i;
	}

}
