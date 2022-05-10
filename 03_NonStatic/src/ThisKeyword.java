
public class ThisKeyword {

	// Non static variable
	int rollNo;
	
	// Constructor -> Same name as className, public
	ThisKeyword () {
		System.out.println("Inside Constructor");
		System.out.println(this);
		System.out.println(this.rollNo);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword obj1 = new ThisKeyword();
		obj1.rollNo = 100;
		
		ThisKeyword obj2 = new ThisKeyword();
		obj2.rollNo = 200;
		
		System.out.println("Roll no 1 - "+obj1.rollNo);
		System.out.println("Roll no 2 - "+ obj2.rollNo);
	}

}
