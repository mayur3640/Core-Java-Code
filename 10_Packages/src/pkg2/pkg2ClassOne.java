package pkg2;
import pkg1.ClassOne;

import pkg1.subpkg1.*;

public class pkg2ClassOne {
	
	// import package1
	
	public static void main(String args[]) {
		// Now create object
		ClassOne obj = new ClassOne();
		
		System.out.println(obj.a);
		obj.methodA();
				
		// Accessing subpackage 
		subClassOne obj1 = new subClassOne();
		obj1.subClass1Method();
	}
}
