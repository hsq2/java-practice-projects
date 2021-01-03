/** 
The factory pattern is one of the most used design patterns in Java

Comes under 'creational pattern' as this pattern provides one of the best ways to create an object

We create the object without exposing the creation logic to the client and refer to newly created object using a common interface.

*** IMPLEMENTATION ***

We are going to create a Shape interface and concrete classes, implementing the Shape interface.

A factory class ShapeFactory is defined as a next step.

FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object.
	It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.


STEP 1: CREATE AN INTERFACE

**/

//Shape.java

public interface Shape {
	void draw();
}

//STEP 2: Create concrete classes implementing the interface

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}

public class Circle implements Shape {
	@Override\
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}

//STEP 3: Create a Factory to generate objects of concrete class based on given information

public class ShapeFactory {
	//use getShape method to get object of type shape
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}

//STEP 4: Use the Factory get object of concrete class by passing an information such as type.

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		//get an object of each Shape and call its draw method
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		Shape shape3 = shapeFactory.getShape("SQUARE");

		shape1.draw();
		shape2.draw();
		shape3.draw();

	}
}


