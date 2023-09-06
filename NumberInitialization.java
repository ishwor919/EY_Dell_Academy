package SecondDay;

public class NumberInitialization {
	int number1;
	static int number2;
	
	static {
		System.out.println("Static Initializer");
		number2 = 100;
	}
	
	NumberInitialization(){
		number1 = 78;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		System.out.println("The value of number2 is " + number2);
		
		NumberInitialization obj = new NumberInitialization();
		System.out.println("The value of number1 is " + obj.number1);


	}

}
