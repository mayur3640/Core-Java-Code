
public class StaticMethod {

	public static void main(String[] args) {
		
		// Calling static method - className.method()
		StaticMethod.method1();
	}
	
	static void method1 () {
		System.out.println("Inside Static Method");
	}
	
	static {
		System.out.println("Calling static method from static block");
		StaticMethod.method1();
	}
}
