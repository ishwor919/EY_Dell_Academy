package SecondDay;
interface ABC{}
class parent implements ABC{}
class child1 extends parent{}
class child2 extends parent{}

public class InstanceOfKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new parent();
		child1 c1 = new child1();
		child2 c2 = new child2();
		
		System.out.println(p instanceof parent);
		System.out.println(p instanceof child1);
		System.out.println(p instanceof child2);
		
		System.out.println(c1 instanceof parent);
		System.out.println(c1 instanceof child1);
		
		System.out.println(c2 instanceof parent);
		System.out.println(c2 instanceof child2);
		
//		System.out.println(c1 instanceof child2);
//		System.out.println(c2 instanceof child1);
		
		System.out.println(c1 instanceof ABC);
		System.out.println(c2 instanceof ABC);
		System.out.println(p instanceof ABC);
		

	}

}
