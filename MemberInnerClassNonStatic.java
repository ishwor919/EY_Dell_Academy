package SecondDay;

public class MemberInnerClassNonStatic {
	private int data = 10;

	class ABC {
		void show() {
			System.out.println("The Value of data is " + data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberInnerClassNonStatic obj = new MemberInnerClassNonStatic();
		MemberInnerClassNonStatic.ABC obj2 = obj.new ABC();
		obj2.show();

	}

}
