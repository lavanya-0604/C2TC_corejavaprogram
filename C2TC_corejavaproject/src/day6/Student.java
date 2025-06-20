package day6;
//final variable should be initialized or else it will create a error in the constructor
//if it is final static give the variable in the static block
public class Student {
    private String name;
    private static int id;
    private int register;
    private final int x;
    private final static int y;//final can be changed  for separate object whereas the final static is the constant cannot be changed
    static {
    	y=100;
    	System.out.println("static block executed....");
    }
    
    public Student(int x) {//we have to initiate the final keyword
    	this.x = x;
    	id++; //it will increment because it has only one memory
    	register++; //it has separate memory for separate object that created
    	System.out.println("constructor called...");
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Student.id = id;
	}
	public int getRegister() {
		return register;
	}
	public void setRegister(int register) {
		this.register = register;
	}
	@Override
	public String toString() {
		return "Student [id:"+id+ ",name=" + name + ",reg:"+ register +"]";
	}
	
	
    
}
