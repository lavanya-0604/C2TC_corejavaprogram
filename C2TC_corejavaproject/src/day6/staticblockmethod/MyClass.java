package day6.staticblockmethod;

public class MyClass {
	private int section ; //non-static or instance variable
	private static int srNo; //static or class variable
	//static Block
	static
	{
		srNo=1000;
		System.out.println("-----------Within Static Block---------");
		
	}
	
	//default constructor
	public MyClass()
	{
		System.out.println("--------------Within Default Constructor-----------");
		srNo++;
		section++;	//it cannot increment bcs it is not private static	
	}
	
	@Override
	public String toString() {
		return "MyClass [Serial No "+srNo+", Section=" + section + "]";
	}

	//static method
	static void display() //it is optional to display
	{
	//	System.out.println("Section : "+section); //can't access non static members	
		System.out.println("Serial No. "+srNo); 
	}
}