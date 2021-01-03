/**
Abstract Factory patterns work around a super-factory which creates other factories

This factory is also called a factory of factories

This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object

In AFP an interface is repsonsible for creating a factory of related objects without explicitly specifying their classes.
Each generated factory can give the objects as per the Factory pattern.


*** IMPLEMENTATION ***

We are going to create a Shape interface and concrete class implementing it.
We create an abstract factory class AbstractFactory as next step.
Factory class ShapeFactory is defined, which extends AbstractFactory. S factory creator/generator class FactoryProducer is created.

AbstractFactoryPatternDemo, our demo class, uses FactoryProducer to get AbstractFactory object. It will pass information (CIRCLE/RECTANGLE/SQUARE for Shape) to AbstractFactory to get the type of object it needs.

**/


//STEP 1: Create an interface for Shapes

public interface Shape {
	void draw() {
	}
}

//STEP 2: Create concrete classes implementing the same interface

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}

public class RoundedRectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Inside RoundedRectangle::draw() method.");
	}
}

public class Square implements Shape {
	@Override\
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}

public class RoundedSquare implements Shape {
	@Override\
	public void draw() {
		System.out.println("Inside RoundedSquare::draw() method.");
	}


//STEP 3: Create an Abstract class to get factories for Normal and Rounded Shape Objects

public abstract class AbstractFactory {
	abstract Shape getShape(String shapeType);
}


//STEP 4: Create Factory classes extending AbstractFactory to generate object of concrete class based on given information

public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}


public class RoundedShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}
}

//STEP 5: Create a Factory generator/producer class to get factories by passing information such as Shape

public class FactoryProducer() {
	public static AbstractFactory getFactory (boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory;
		} else {
			return new ShapeFactory;
		}
	}
}


//STEP 6: Use the FactoryProducer to get AbstractFactory in order to get factories of concrete classes by passing information such as Type.

public class AbstractFactoryPatternDemo {
	public static void main (String[] args) {
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		//get an object of Shape Rectangle
		Shape shape1 = shapeFactory.getShape("Rectangle");
		Shape shape2 = shapeFactory.getShape("Square");
		shape1.draw();
		shape2.draw();

		AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
		Shape shape3 = shapeFactory.getShape("Rectangle");
		Shape shape4 = shapeFactory.getShape("Square");
		shape3.draw();
		shape4.draw();

	}
}