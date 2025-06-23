package day2;

public class OperatorsDemo {

	public static void main(String[] args) {
		int a = 10;
        int b = 20;
        int x = 10;
        System.out.println("a and b value before the operations: " + a + " " + b);

        ++a;//pre-increment so 11 
        int c = ++a + b + a--;//++a → Pre-increment again: a becomes 12, and 12 is used in expression.
        //a-- → Post-decrement: 12 is used in expression first, then a becomes 11.
        System.out.println("c value after the operations: " + c);

        int d = c++ + a + b--;//a value will be 11 because of the above operations
        System.out.println("d value after the operations: " + d);

        System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);

        x = (10 == x) ? 1 : 0;//tertiary condition
        System.out.println(x);

	}

}
