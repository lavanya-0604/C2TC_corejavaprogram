package day1;
//float 7 decimal
//double 15-16 decimal
public class DatatypeDemo {
	 public static void main(String[]args)
		    {
		        int value1 = 9 / 2;
		        float value2 = 101 / 61 ;
		        double value3 = 10d/6d;//d to store as a double
		        float value4 = 5/2.5f;//f to store as a float
		        System.out.println("value 1="+ value1);
		        System.out.println("value 2="+ value2);
		        System.out.println("value 3="+ value3);
		        System.out.println("value 4="+ value4);

		        int marker = 512;

		        double percentage = marker*0.46f;//Using 0.46f shows how float and integer interact to give the double value in output
                //if it is a float percentage its output is 235.52 
		        System.out.println("percentage :" + percentage);

		    }
		}
