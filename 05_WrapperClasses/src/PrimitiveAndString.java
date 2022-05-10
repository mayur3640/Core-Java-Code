
public class PrimitiveAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primitive to string -> ObjClass.toString(primitive)
		
		// String to Primitive -> ObjClass.parseDtype(string)
		
		byte bx = 10;
		
			String sbx = Byte.toString(bx);
			
			byte rbx = Byte.parseByte(sbx);
			
			System.out.println("Byte - "+(bx)+" "+(sbx)+" "+(rbx));
		
		short sx = 50;
		
			String ssx = Short.toString(sx);
			
			short rsx = Short.parseShort(ssx);
		
			System.out.println("Short - "+(sx)+" "+(ssx)+" "+(rsx));
		
		int ix = 100;
		
			String six = Integer.toString(ix);
			
			int rix = Integer.parseInt(six);
			
			System.out.println("Integer - "+(ix)+" "+(six)+" "+(rix));
	}

}
