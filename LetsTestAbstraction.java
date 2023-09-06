package SecondDay;

abstract class shape{
	//unique functionality - define
	abstract void draw(); //declaration
	
	int length,breadth,height,area,radius;
	double areaOfCircle;
	//common functionality which every one can use.
	
	void purpose() {
		System.out.println("Calculate the area of different shapes");
	}
}

class Triangle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		int breadth = 20,height = 30;
		area = (breadth * height)/2;
		System.out.println("Area of Triangle is " + area);
	}
	
}

class Rectangle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		int length = 20, breadth = 30;
		area = (length * breadth)* 2;
		System.out.println("Area of Rectangle is " + area);

	}
	
}

class circle extends shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		int radius = 10;
		areaOfCircle = Math.PI * radius * radius;
		purpose();
		System.out.println("Area of Circle is " + areaOfCircle);

	}
	
}
public class LetsTestAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//shape sh = new shape();
		Triangle  tr = new Triangle();
		tr.draw();
		Rectangle rect = new Rectangle();
		rect.draw();
		circle circ = new circle();
		circ.draw();
	}

}

