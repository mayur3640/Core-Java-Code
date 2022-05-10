
public class ObjectAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Object to String -> object.toString();
		
		// String to Object -> ObjClass.valueOf(string);
		
		byte bx = 10;						// Primitive
		Byte objBx = Byte.valueOf(bx);		// Object of Primitive
		
			String sbx = objBx.toString();
			
			Byte rObjBx = Byte.valueOf(sbx);
			
			System.out.println("Byte - "+objBx+" "+sbx+" "+rObjBx);
	}

}
