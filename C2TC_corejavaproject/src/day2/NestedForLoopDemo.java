package day2;

public class NestedForLoopDemo {
	 public static void main(String[] args) {
	        int beg = 10;
	        int end = 20;
//For each value of i, j goes from 1 to 10.
	        for (int i = beg; i <= end; i++) {
	            for (int j = 1; j <= 10; j++) {
	                System.out.println(i + "*" + j + "= " + i * j);
	            }
	            System.out.println();
	        }
	    }
}
