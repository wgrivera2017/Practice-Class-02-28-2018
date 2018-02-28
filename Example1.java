import java.util.Scanner;
public class Example1 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);			 //created scanner
		
		for(int i =0; i < 3; i++) {
		System.out.println("Imput anything");
		String x = scanner.nextLine();
		
		int y = x.length();
		char c1 = x.charAt(y-1);
		System.out.println(c1);
		
		}

	}

}
