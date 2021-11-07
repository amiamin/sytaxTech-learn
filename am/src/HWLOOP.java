import java.util.Scanner;

public class HWLOOP {

	public static void main(String[] args) {

		int sumOfEvenNumber = 0;
		int sumOfOddNumber = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sumOfEvenNumber = sumOfEvenNumber + i;
			} else if (!(i % 2 == 0)) {
				sumOfOddNumber = sumOfOddNumber + i;
			}
		}
		System.out.println("sumOfEvenNumber = " + sumOfEvenNumber + " ");
		System.out.println("sumOfOddNumber = " + sumOfOddNumber + " ");

		////////////////////////////////////////////////
		int price = 30;
		String item;
		Scanner s = new Scanner(System.in);
		System.out.println("what do you want to buy?");
		item = s.next();
		System.out.println("The prince of " + item + " = " + price);

		System.out.println("Please enter the amount  ");
		int amount = s.nextInt();
		while (price != amount) {

			if (price < amount) {
				System.out.println("give change " + (amount - price));
			} else if (price > amount) {
				System.out.println("how much more you need?  " + (price - amount));
				price = price - amount;
				amount = s.nextInt();
				if (price == amount) {
					System.out.println(" Thank you for shopping! ");
					break;
				}

			}

			amount = s.nextInt();
		}

	}

}
