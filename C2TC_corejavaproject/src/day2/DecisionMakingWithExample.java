package day2;

public class DecisionMakingWithExample {
	public static void main(String[] args) {
        int x = 8, y = 7;
        int a = 10, b = 11;
        
        
        if (x >= y) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        if (!(a < b) || (a == b)) {//!indicated for not and || for OR
            System.out.println("Condition is TRUE");
        } else {
            System.out.println("Condition is FALSE");
        }
    }
}
