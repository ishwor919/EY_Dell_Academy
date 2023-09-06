package SecondDay;

public class PersonData implements Cloneable{
	//non - static /instance variable
	int person_id;
	String person_Name;
	
	PersonData(int person_id, String Person_Name){
		this.person_id = person_id;
		this.person_Name = person_Name;
	}
	
//	public Object clone() throws CloneNotSupportedException { return super.clone(); }
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PersonData obj1 = new PersonData(123, "ABC");
		PersonData obj2 = (PersonData) obj1.clone();
		
		System.out.println("Person Id is " + obj1.person_id + " and name is " + obj1.person_Name);
		System.out.println("Person Id is " + obj2.person_id + " and name is " + obj2.person_Name);

	}

}
