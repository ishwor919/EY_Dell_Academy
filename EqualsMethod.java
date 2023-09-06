package SecondDay;

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "string is a immutable class";
		String str2 = "string is a immutable class";

		if(str1 == str2){
			System.out.println(" == works for literals or constants");
		}
		else {
			System.out.println(" == does not works for literals or constants");

		}
		
		//For Object
		String str3 = new String("string is a immutable class");
		String str4 = new String("string is a immutable class");
		
		if(str3 == str4) {
			System.out.println(" == works for literals or constants");
		}
		else {
			System.out.println(" == does not works for literals or constants");
		}
		
		if(str3.equals(str4)) {
			System.out.println(" == Equlas method works for ObJECTS");
		}
		else {
			System.out.println(" == Equals method does not works for OBJECTS");
		}
		
		System.out.println("Memory Address is " + str3.hashCode());
		System.out.println("Memory Address is " + str4.hashCode());

	}

}
