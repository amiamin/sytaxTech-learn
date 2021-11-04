package test.syntax.tech;

/**
 * 
 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
 * specific attributes and behaviors.
 *
 */
public class Phone {

	String brand;

	void getIphonBrand() {
		brand = "iphone";
		System.out.println("The brand is " + brand);
	}
	
	void getAndroidBrand() {
		brand = "Android";
		System.out.println("The brand is " + brand);
	}
	
	void getNokiaBrand() {
		brand = "Nokia";
		System.out.println("The brand is " + brand);
	}

	
	// main method
	public static void main(String[] args) {
		
		// Steps to call the internal methods 
		// 1- Create an object from the CLASS: CLASS_NAME OBJECT_NAME = new CLASS_NAME(); 
		// 2- And then call the internal methods object.METHOD_NAME
		
		// 1- CLASS_NAME OBJECT_NAME = new CLASS_NAME(); 
		Phone iphone = new Phone(); 
		// 2- OBJECT_NAME.METHOD_NAME
		iphone.getIphonBrand();
		

		Phone android = new Phone(); 
		android.getAndroidBrand();
		
		Phone nokia = new Phone(); 
		nokia.getNokiaBrand();
		
	}

}
