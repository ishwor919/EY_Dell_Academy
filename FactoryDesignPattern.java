package com.programming.class11;


interface Shape{
	public void draw();
}


class Rectangle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}

class Circle implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}

class Square implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

}

class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		if (shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		if (shapeType.equalsIgnoreCase("Square")) {
			return new Square();
		}
		return null;
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("Circle");
		shape1.draw();

		//Shape shape2 = shapeFactory.getShape("Rectangle");// if we do mistake in object then it can lead to exception
		//shape2.draw();
		
//		Shape shape2 = shapeFactory.getShape("Retangle");// mistake in rectangle spelling which causes exception
//		shape2.draw();
		
		//this can be removed by putting them in try catch block.
		try {
			Shape shape2 = shapeFactory.getShape("Retangle");// mistake in rectangle spelling which causes exception
			shape2.draw();
		} catch(NullPointerException e) {
			System.out.println("Null pointer exception came here for object");
		}
		

		Shape shape3 = shapeFactory.getShape("Square");
		shape3.draw();

	}

}
