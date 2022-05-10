
public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(10>1 & 10>2) {
			System.out.println("Both are true");
		}
		if (10>1 | 10 <2) {
			System.out.println("Only 1 or both are true");
		}
		
		boolean a = true;
		System.out.println(!a);
		
		// Bitwise on Numbers
		System.out.println(4 & 5);	// AND -> Both 1 -> then 1
		System.out.println(4 | 5);	// OR -> If any bit is 1 -> then 1
		System.out.println(4 ^ 5);  // XOR -> If bits are opposite -> then 1
		
		System.out.println(~4);		// Binary Unary Complement -> Flips 1 to 0, 0 to 1
		
	}

}
