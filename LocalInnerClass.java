package SecondDay;

public class LocalInnerClass {
	private int data = 30;
	
	void message() {
		
		class XYZ{
			void show() {
				System.out.println("The Value of data is " + data);
		}
}	
		XYZ obj = new XYZ();
		obj.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass obj2 = new LocalInnerClass();
		obj2.message();
	}

}
