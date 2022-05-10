
public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Mayur";
		String s2 = "Patil";
		
		System.out.println(s1+s2);
		System.out.println(s1+" "+s2);
		
		// For integer
		int a1 = 10;
		int a2 = 100;
		
		System.out.println(a1+a2);
		
		// Mix - String + Number
		// In these mix cases, always datatype of left side is considered first ->
			// as expression is evaluated from LEFT to RIGHT side
		
		System.out.println(s1+a1+a2);	// concat everything
		
		System.out.println(a1+a2+s1);	// first add a1 and a2, then append to string
	}

}
