package day6;//static method always execute first regarding any places 
//there should be only one main method

public class StudentDemo {
public static void main(String[]args) {
	
	Student s1 = new Student(100);
	System.out.println(s1);
	
	Student s2 = new Student(200);
	System.out.println(s2);
	
	Student s3 = new Student(300);
	System.out.println(s3);
}
}
