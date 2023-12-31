package SecondDay;

import java.util.Objects;

class Employee{
	String firstName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(firstName, other.firstName);
	}
}

public class LetsTestEqualsWithUserDefinedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setFirstName("ABC");
		e2.setFirstName("ABC");
		
		if(e1.equals(e2)) {
			System.out.println("Equals work with Custom class or used defined class");
		}
		else {
			System.out.println("Equals does not work with Custom class or used defined class");
		}
		
		System.out.println("Memory Address id " + e1.hashCode());
		System.out.println("Memory Address is " + e2.hashCode());


	}

}
