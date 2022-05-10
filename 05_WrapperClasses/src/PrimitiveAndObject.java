
public class PrimitiveAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primitive to Object -> ObjClass.valueOf(primitive)
		
		// Object to primitive -> Object.dtyopeValue()
		byte bx = 10;
			
			Byte objBx = Byte.valueOf(bx);
			
			byte rbx = objBx.byteValue();
			
			System.out.println("Byte - "+(bx)+" "+(objBx)+" "+(rbx));
		
		short sx = 50;
		
			Short objSx = Short.valueOf(sx);
			
			short rsx = objSx.shortValue();
		
			System.out.println("Short - "+(sx)+" "+(objSx)+" "+(rsx));
		
		int ix = 100;
		
			Integer objIx = Integer.valueOf(ix);
			
			int rix = objIx.intValue();
			
			System.out.println("Integer - "+(ix)+" "+(objIx)+" "+(rix));
		
		long lx = 1000;
		
			Long objLx = Long.valueOf(lx);
			
			long rlx = objLx.longValue();
			
			System.out.println("Long - "+(lx)+" "+(objLx)+" "+(rlx));
		
		float fx = 10.00f;
			
			Float objFx = Float.valueOf(fx);
			
			float rfx = objFx.floatValue();
			
			System.out.println("Float - "+(fx)+" "+(objFx)+" "+(rfx));
		
		double dx = 1000.0;
		
			Double objDx = Double.valueOf(dx);
			
			double rdx = objDx.doubleValue();
			
			System.out.println("Double - "+(dx)+" "+(objDx)+" "+(rdx));
		
		char cx = 'A';
			
			Character objCx = Character.valueOf(cx);
			
			char rcx = objCx.charValue();
			
			System.out.println("Character - "+(cx)+" "+(objCx)+" "+(rcx));
			
		boolean blx = true;
		
			Boolean objBlx = Boolean.valueOf(blx);
			
			boolean rblx = objBlx.booleanValue();
			
			System.out.println("Boolean - "+(blx)+" "+(objBlx)+" "+(rblx));
	}

}
