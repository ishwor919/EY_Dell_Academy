package SecondDay;

public class EmployeeData {
	//non-static
	int empID;
	String empName;
	
	static String orgAddress = "ABC XYZ";
	static void orgAddressChange() {
		orgAddress = "MNO PQR";
	}
	
	EmployeeData(int empID, String empName){
		this.empID = empID;
		this.empName = empName;
	}
	
	void display() {
		System.out.println("Id of employee is " + empID + "and name of emp is " + empName + " and orgAddress is " + orgAddress);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeData.orgAddressChange();
		EmployeeData e1 = new EmployeeData (123,"IShwor");
		EmployeeData e2 = new EmployeeData(456,"Mahato");
		
		e1.display();
		e2.display();


	}

}
