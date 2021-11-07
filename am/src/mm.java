import java.util.Scanner;

public class mm {

	public static void main(String[] args) {
		boolean understandjava = true;
		boolean enjoyjava = true;
		if (understandjava && enjoyjava) {
			System.out.println("that is awesome");
		} else {
			System.out.println("you probbaly need to studye");
		}
////////////////////////////////////
		Scanner in = new Scanner(System.in);

		System.out.println("Please enter the number");
		int num = in.nextInt();
		if (num > 1 && num < 10) {
			System.out.println("small");
		} else if (num >= 11 && num <= 100) {
			System.out.println("medium");
		} else if (num > 101 && num <= 1000) {
			System.out.println("large");
		} else if (num >= 1001 && num <= 10000) {
			System.out.println(num + "is Xlarge");
		}

	}

}
