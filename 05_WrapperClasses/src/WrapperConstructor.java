
public class WrapperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// We can use Constructor to convert 
		
			// 1. Primitive to Object
			// 2. String to Object
		
		int ix = 100;
		Integer objIx = new Integer(ix);
		System.out.println("Integer - "+ix+" "+objIx);
		
		String sx = "10000";
		Long objLx = new Long(sx);
		System.out.println("Long - "+sx+" "+objLx);
		

	}

}
