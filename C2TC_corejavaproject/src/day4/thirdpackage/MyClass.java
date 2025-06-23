package day4.thirdpackage;
//single ton 

public class MyClass {
	private static MyClass obj=new MyClass();//private static holds the single instance 
	//here itself obj is created 
	private int id;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private MyClass() {
		System.out.println("MyClass object created");		
	}
	
	public static MyClass getObject() //factory method (here we can access the obj in the class variable)
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
}