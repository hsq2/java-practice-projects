/** 
Singleton pattern is one of the simplest design patterns in Java

This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created

This class provides a way to access its only object which can be accessed directly without the need to instantiate the object of the class

*** IMPLEMENTATION ***

We're going to create a SingleObject class. SingleObject class has its own constructor as private and have a static instance of itself.

SingleObject class provides a static method to get its static instance to the outside world.

SingletonPatternDemo, our demo class, will use SingleObject class to get a SingleObject object

**/


// STEP 1: Create a Singleton Class

public class SingleObject {
	//create an object of SingleObject

	private static SingleObject instance = new SingleObject();

	//make the constructor private so that this class cannot be instantiated

	private SingleObject() {}

	//get the only object available
	public static SingleObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello World!");
	}
}

public class SingletonPatternDemo {
	public static void main(String[] args) {
		//illegal construct
		//compile time error: the constructor SingleObject()
		//SingleObject object = new SingleObject();

		//get the only object available
		SingleObject object = SingleObject.getInstance();

		//show the message
		object.showMessage();
	}
}