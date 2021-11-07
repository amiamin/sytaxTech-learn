import java.util.Scanner;

public class atoutyy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("do you have a credit card?");

		String answer = input.next();
		if (answer.equals("yes") && answer.equals("yep") && answer.equals("yeah")) {
			System.out.println("please tell me the ballanse");
			System.out.println();

		} else {
			System.out.println("end of the code");
		}
		boolean boo=true;
		System.out.println(!boo);
		
		
		
		
	}
}