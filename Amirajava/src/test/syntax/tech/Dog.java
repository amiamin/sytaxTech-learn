package test.syntax.tech;

/**
 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
 * Labrador with specific attributes and behaviors.
 *
 */
public class Dog {

	// variables 
	String name;
	int age;
	String color;
	String type;

	// internal methods
	void husky() {
		name = "dog1";
		age = 3;
		color = "black";
		type = "Husky";
		System.out.println(name + " " + age + " " + color + " " + type);
	}

	void bulldog() {
		name = "dog2";
		age = 7;
		color = "Yellow";
		type = "Bulldog";
		System.out.println(name + " " + age + " " + color + " " + type);
	}

	void labrador() {
		name = "dog3";
		age = 13;
		color = "white";
		type = "Labrador";
		System.out.println(name + " " + age + " " + color + " " + type);
	}
	
	public static void main(String[] args) {
		// 1- CLASS_NAME OBJECT_NAME = new CLASS_NAME(); 
		Dog husky = new Dog(); 
		// 2- OBJECT_NAME.METHOD_NAME
		husky.husky();
		
		Dog bulldog = new Dog(); 
		bulldog.bulldog();
		
		Dog labrador = new Dog(); 
		labrador.labrador();
	}
}
