import java.util.Scanner;

public class IDcard{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input your ID card number");
		String line = scanner.nextLine();
		System.out.println("your ID card is " +line.length() + " wei");
	}
}
