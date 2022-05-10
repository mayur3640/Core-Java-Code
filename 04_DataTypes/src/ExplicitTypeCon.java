
public class ExplicitTypeCon {

	public static void main(String[] args) {
		
		// Explicit -> When higher is assigned to lower one
		
		int a = 100;
		// byte b = a; -> Error
		byte b = (byte)(a);
		System.out.println(b);
		
		
		int x = 65;
		char c = (char)x;
		System.out.println(c);
		
		// Explicit Typecase -> Beyond Level -> goes in clockwise circular fasion
		int aa = 130;
		byte bb = (byte)(aa);
		System.out.println(aa);
		System.out.println(bb);
		
	}

}
