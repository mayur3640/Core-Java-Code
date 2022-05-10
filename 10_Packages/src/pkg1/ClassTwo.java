package pkg1;

public class ClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassOne obj = new ClassOne();
		
		// Accessing data members and functions from other java file from same package
		System.out.println(obj.a);
		
		obj.methodA();
	}

}
