import java.util.Scanner;

public class mirav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int y = 5;
		if (x > y) {
			System.out.println(x + " is a largeest ");

		} else {
			System.out.println(y + " is the largest");
		}
/////////////////////////////////////
		int loan = 50000;
		if (loan < 200000) {
			System.out.println("accpet");
		} else if (loan > 200000) {
			System.out.println("reject");
		}
/////////////////////////////////////
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the age ");
		int age = s.nextInt();
		if (age > 18) {
			System.out.println("issue driver license");
		} else if (age < 18) {
			System.out.println("learners permit");
		}
///////////////////////////////////
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter the city");
		String city = scanner.nextLine();
		System.out.println("please enter the temprature");
		double temp = scanner.nextDouble();

		System.out.println("City is " + city + " temp is " + temp);
/////////////////////////////////////////////////

		Scanner sc = new Scanner(System.in);
		System.out.println("Do you have credit card? (true/false)");
		boolean checkCreditCard = sc.nextBoolean();

		if (checkCreditCard == false) {
			System.out.println("apply credit card");
		} else {
			System.out.println("please enter your balance");
			double balance = sc.nextDouble();
			if (balance < 1000) {
				System.out.println("you can spend more");
			} else if (balance > 1000) {
				System.out.println("pay off immediately");
			} //////////////////////////////////////////
			Scanner input = new Scanner(System.in);
			System.out.println("please enter the number of worked years");
			int no = input.nextInt();
			System.out.println("please enter annual sallary");
			int salary = input.nextInt();
			if (no >= 5) {
				System.out.println("eligible for the bonus");
			} else {
				System.out.println("your bonus is 3000");

			}

		}

	}

}
