
public class classs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println();
		
		
		String[][] groscaries= {
				
				{"banana","apple" ,"mango"},
				{"potato", "tomato"},
				
				{"milk","cheese","ayran","yogurt"}
		};
		
		System.out.println(groscaries.length);
		System.out.println(groscaries [2][3]);
		
		System.out.println("3 of elements inside 1 array = "+groscaries[0].length);
	System.out.println("3 of elements inside  2 array = " +groscaries[1].length);
	System.out.println("3 of elements inside 3 array = " +groscaries[2].length);
	for(int i=0; i<groscaries.length; i++) {
	for(int j=0; j<groscaries[i].length; j++) {
		
		System.out.print(groscaries[i][j]+" ");
		System.out.println(element);
		String element=groscaries[i][j];
		if(element.equals("ayran")) {
		total++;
		}
	}
	
	System.out.println("----------------------------");
	}
System.out.println();

System.out.println("# of elements inside array = "+groscaries[0].length);

}
}
