package SecondDay;
abstract class Sample{
	abstract void show();
}

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample() {

			@Override
			void show() {
				// TODO Auto-generated method stub
				System.out.println("Hello Everyone! ");
			}
	};
	obj.show();
	}
}
