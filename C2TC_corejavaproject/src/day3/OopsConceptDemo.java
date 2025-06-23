package day3;
//toString method only has the ability to provide the value of the data
public class OopsConceptDemo {
	    private int serialNum;
	    private String name;
	    private int age;
//here there is no constructor presented
	    public int getSerialNum() {//setting with the datatype
	        return serialNum;
	    }

	    public void setSerialNum(int serialNum) {//It doesn’t return anything — just performs an action.
        //So its return type is void.
	        this.serialNum = serialNum;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {//it always should consists of the datatype inside the bracket
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Object class method - to return a string representation of the object
	    //It gives a meaningful, human-readable description of the object
	    //instead of void display we r using the toString bcs it on;u provide the id like day3.OopsConceptDemo@6f539caf
       @Override
	    public String toString() {
	        return "OopsConceptDemo [Serial Number=" + serialNum + ", name=" + name + ", age=" + age + "]";
	    }
}
