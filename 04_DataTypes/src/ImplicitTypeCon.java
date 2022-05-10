
public class ImplicitTypeCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Implicit -> when we try to assign lower value to higher value -> Automatic
		
		byte bvar = 100;
		int ivar = bvar;
		System.out.println(bvar);
		System.out.println(ivar);
		
		// character to int
		char cvar = 'A';
		int cint = cvar;
		System.out.println(cvar);
		System.out.println(cint);
	}

}
