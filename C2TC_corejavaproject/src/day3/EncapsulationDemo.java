package day3;

public class EncapsulationDemo {
	public static void main(String[] args) {
        // object creation
        OopsConceptDemo obj = new OopsConceptDemo();
        obj.setSerialNum(101);//caps for the java beans convention easy to understand
        obj.setName("Pooja");
        obj.setAge(20);
        System.out.println(obj);
    }
}
