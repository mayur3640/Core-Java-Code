
public class ObjectCreation {
	
	int rollNo;
	
	// inside a static block
	static {
		ObjectCreation localStatObj = new ObjectCreation();
		System.out.println(localStatObj);
	}
	
	// Global Object inside static block
	static ObjectCreation globalStatObj;
	
	static {
		System.out.println(ObjectCreation.globalStatObj);
		ObjectCreation.globalStatObj = new ObjectCreation();
	}

	public static void main(String[] args) {
		// access global object
		System.out.println(globalStatObj);
	}

}
