import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);

		System.out.println("Imput anything");
		String x = scanner.nextLine();

	}

	

	public static String first(String z) {

		char c1 = z.charAt(0);		
		int y = z.length()-2;
		char c2 = z.charAt(y);
		String firlas = c1 + " " + c2;
		return firlas;
		
		
	}

}
