package day4;
/*In Java, a Singleton is a design pattern used to ensure that only one instance of a class
 *  is created during the entire runtime of an application, 
 *  and that one instance is globally accessible.
 */

public class Studententityclass {
	private static Studententityclass s1 = new Studententityclass();
	 private String name;
	 private int age;

public static Studententityclass getS1() {//static is presented 
		return s1;
	}
public static void setS1(Studententityclass s1) {
	 Studententityclass.s1 = s1;
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
@Override
public String toString() {
	return "Studententityclass [name=" + name + ", age=" + age + "]";
}

}
