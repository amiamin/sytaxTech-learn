import java.util.Scanner;

public class mira {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		 
		int i=5;
		while (i>=1) {
		
		
		System.out.println(" Please enter your name and age");
		
		String name=scan.next();
		int age=scan.nextInt();
		
		System.out.println("your name is " +name+ " and you are " +age+ " years old ");
	i++;
	}
		
}
}