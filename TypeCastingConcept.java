package SecondDay;

class Machine{
	void start() {
		System.out.println("Machine has started!");
	}
	
	void stop() {
		System.out.println("Machine has stopped!");

	}
}

	class Camera extends Machine{
		@Override 
		void start() {
			System.out.println("Camera has started !");
		}
		
		void snap() {
			System.out.println(" Photo clicked !");

		}
	}
	
public class TypeCastingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine m = new Machine();
		m.start();
		m.stop();
		
		Camera c = new Camera();
		c.start();
		c.stop();
		c.snap();
		
		Machine M1 = new Camera();
		M1.start();
		M1.stop();
		//M1.snap();
		
		
		Machine pc = new Camera(); //upcasting here
		pc.start();
		pc.stop();
		
		
		//Upcasting Automatically
		Machine m2 = c;//giving access of the child class to machine class.
		m2.start();
		m2.stop();
		
		//Downcasting - correct
		Machine m3 = new Camera();
		Camera c2 = (Camera)m3; //downcasting
		c2.start();
		c2.stop();
		c2.snap();

	}

}
