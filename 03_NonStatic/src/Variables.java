
public class Variables {
	
	// Non static variable
	int rollNo;
	
	// Constructor -> Same name as className, public
	Variables () {
		System.out.println("Inside Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables obj1 = new Variables();
		obj1.rollNo = 100;
		
		Variables obj2 = new Variables();
		obj2.rollNo = 200;
		
		System.out.println("Roll no 1 - "+obj1.rollNo);
		System.out.println("Roll no 2 - "+ obj2.rollNo);
	}

}
