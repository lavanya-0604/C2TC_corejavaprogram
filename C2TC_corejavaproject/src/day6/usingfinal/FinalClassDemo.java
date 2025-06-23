package day6.usingfinal;


//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
class FinalChildClass extends FinalClass {//final class cannot be extended
}

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClass f1 = new FinalClass(); // Call show() method using object reference variable ab.
		f1.show();
	}
}
