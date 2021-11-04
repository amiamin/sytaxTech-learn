
public class test {

	public static void main(String[] args) {

		// loop 1-100
		// if number can be divide by 2 prin t FIZZ
		// if number can be divide by 5 print bUZZ
		// if number can be divide by 2 && 5 print FIZZFUZZ
		// else print the number

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				System.out.println("FIZZFUZZ");
			}
			else if (i % 2 == 0) {
				System.out.println("FIZZ");
			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			}
			

		}
	}

}
