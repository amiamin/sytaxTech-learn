package test.syntax.tech;

/**
 * Retrieving 1 element from 2D Array Create a 2D array where you will store the
 * following values: Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama. After
 * storing values print the following String: Mrs Smith, Mr Obama, Ms Jackson,
 * Miss Jordan.
 */

public class Test {

	public static void main(String[] args) {

		/** 1D-array */
		// Example for Integers 
		int x = 2;
		int y = 4;
		int[] num = { 2, 4, 5, 7 }; // array of integer 
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		// print array of 1D
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		// Example for Strings
		String name1 = "John"; 
		String name2 = "Kev"; 
		String[] names = {"abc" , "xyz" , "test", "test2", "amira"}; // array of String
		int count = names.length; 
		System.out.println("count= " + count);
		for (int i = 0; i < count; i++) {
			System.out.println(names[i] + " ");
		}
		
		/** 2D-array */
		// Example for integers 
		int[][] numers = { {2,3} ,{4,5}, {8,9} };
		/**
		 *  	  j=0, j=1
		 *  i=0 > [2,  3] 
		 *  i=1 > [4,  5]
		 *  i=2 > [8,  9]
		 */
		System.out.println("length = " + numers.length);
		for (int i = 0; i < numers.length; i++) {
			for (int j = 0; j < numers[i].length; j++) {
				System.out.print(numers[i][j] + " ");
			}
			System.out.println();
		}
		
		// Example for String
		/**
		 * [abc, xyz] 
		 * [tvd, uil] 
		 * [john, power] 
		 */
		String[][] list = { {"abc", "xyz"} , {"tvd", "uil"} , {"john", "power"}  };
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}
