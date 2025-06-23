package day4;

public class studententitydemo {
public static void main(String[]args) {
	Studententityclass st = Studententityclass.getS1();
	st.setName("lavi");
	st.setAge(20);
	Studententityclass st1 = Studententityclass.getS1();//the value will be the same 
	System.out.println(st);
	System.out.println(st1);
	
}
}
