
public class Blocks {

	// Non static variable
		int rollNo;
		
		// Constructor -> Same name as className, public
		Blocks () {
			System.out.println("Inside Constructor");
		}
		
		// Non static block -> called before constructor & for every new object
		{
			System.out.println("Inside Non Static Block");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Blocks obj1 = new Blocks();
			obj1.rollNo = 100;
			System.out.println("Roll no 1 - "+obj1.rollNo);
			
			System.out.println();
			
			Blocks obj2 = new Blocks();
			obj2.rollNo = 200;
			System.out.println("Roll no 2 - "+ obj2.rollNo);
		}


}
