package cs175lab;

public class CounterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates a counter called venue
		Counter venue = new Counter();
		
		//clicks 10 times
		for(int i=1;i<=10;i++) {
			venue.click();
		}
		
		//unclick 5 times
		for(int i=1;i<=5;i++) {
			venue.unclick();
		}
		
		//prints expected counter value (5)
		System.out.println("Expected: 5");
		
		//prints actual counter value
		int actualValue = venue.getValue();
		System.out.println("Actual: " + actualValue);
		
		//reset counter
		venue.reset();
		
		//click 3 times
		for(int i=1;i<=3;i++) {
			venue.click();
		}
		
		//unclick 4 times
		for(int i=1;i<=4;i++) {
			venue.unclick();
		}
		
		//prints expected counter value (-1)
		System.out.println("Expected: -1");
		
		//prints actual counter value
		actualValue = venue.getValue();
		System.out.println("Actual: " + actualValue);

	}
}
