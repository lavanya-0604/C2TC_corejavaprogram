package day3;

public class TaxCalculation {
	// function to calculate tax
	public void calculateTax(Person person) {//takes the Person's object person
		if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax not applicable");
		} else {
			if (person.getIncome() <= 160000) {
				person.setTax(0);
			} else if (person.getIncome() > 160000 && person.getIncome() <= 500000) {
				person.setTax((person.getIncome() - 160000) * 10 / 100);//10% tax
			} else if (person.getIncome() >= 500000 && person.getIncome() <= 800000) {
				//Range: ₹1,60,001 – ₹5,00,000
	            //Difference: ₹5,00,000 - ₹1,60,000 = ₹3,40,000
	            //Tax: 10% of ₹3,40,000 = ₹34,000
				person.setTax((person.getIncome() - 500000) * 20 / 100 + 34000);//20% tax
			} else {
				//(800000-500000)₹3,00,000 * 20% = ₹60,000
                //₹60,000 + ₹34,000 = ₹94,000
				person.setTax((person.getIncome() - 800000) * 30 / 100 + 94000);//30%tax
			}
		}
	}
}
