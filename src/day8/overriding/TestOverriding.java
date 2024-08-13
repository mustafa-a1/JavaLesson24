package day8.overriding;

public class TestOverriding {

	public static void main(String[] args) {
		
		BankOfAmerica ba = new BankOfAmerica();
		System.out.println("ROI of BA = " + ba.roi());
		
		Chase chase = new Chase();
		System.out.println("ROI of Chase = " + chase.roi());
		
		
		
		
		
		
		
	}

}
