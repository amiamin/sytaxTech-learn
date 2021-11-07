import java.util.Scanner;

public class Smsm {

	public static void main(String[] args) {

		int m = 2;
		if (m == 1) {
			System.out.println("jan");
		} else if (m == 2) {

			System.out.println("fab");
		}

		else if (m == 3) {

			System.out.println("mar");
		} else if (m == 4) {

			System.out.println("apr");
		}

		else if (m == 5) {

			System.out.println("may");
		}

		else if (m == 6) {

			System.out.println("jun");
		}

		switch (m) {

		case 1:

			System.out.println("jan");
		case 2:
			System.out.println("fab");
		case 3:
			System.out.println("mar");
		case 4:
			System.out.println("apr");
		case 5:
			System.out.println("may");
		case 6:
			System.out.println("jun");
			break;

		}

	}

}