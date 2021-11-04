package com.syntax.class11;

public class Car {
		String make;
		String model;
		String color;
		int year;
		double milage;
		void moveForward() {
			
			System.out.println("Car can move forward");
		}
			void applybreaks() {
				
				System.out.println("applying breaks");
		}
		public static void main(String[] args) {
			
			Car ayshasCar= new Car();
			 ayshasCar. moveForward();
			 ayshasCar.make="tesla";
			 ayshasCar.model="S";
			 ayshasCar.color="black";
			 System.out.println(" ayshas Car is "+  ayshasCar.make );
			 System.out.println(" ayshas Car is "+  ayshasCar.model );
			 System.out.println(" ayshas Car is "+  ayshasCar.color );
			
			 ayshasCar. moveForward();
			 ayshasCar.applybreaks();
			 
	}
		

}
