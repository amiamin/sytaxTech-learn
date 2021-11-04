package test.syntax.tech;

/**
 * 
 * Write a Java Program to print the first 10 numbers of Fibonacci series
 *
 */
public class Fibonacci {

	int fun(int num) {
		if (num == 0) {
			return 1;
		}
		return num * fun(num - 1);
	}

	public static void main(String[] args) {
		// 1- CLASS_NAME OBJECT_NAME = new CLASS_NAME();
		Fibonacci obj = new Fibonacci();

		// 2- OBJECT_NAME.METHOD_NAME
		int result = obj.fun(10);
		System.out.println("Result = " + result);
	}
}