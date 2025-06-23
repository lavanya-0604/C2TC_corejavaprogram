package day8.interface_project;

public class Executor {
public static void main(String [] args) {
	Purchase p;
	p = new Clothes();
	p.buying();
	p = new Grocery();
	p.buying();
	p = new Cosmetics();
	p.buying();
	
}
}
