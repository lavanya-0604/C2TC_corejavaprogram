package day4;


public class Studententityclass {
	private static Studententityclass s1 = new Studententityclass();
	 private String name;
	 private int age;

public static Studententityclass getS1() {
		return s1;
	}
	 public static void setS1(Studententityclass s1) {
		 Studententityclass.s1 = s1;
	 }
@Override
	public String toString() {
		return "Studententityclass [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
