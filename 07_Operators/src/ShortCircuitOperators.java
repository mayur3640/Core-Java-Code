
public class ShortCircuitOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// here if we use &&, || -> It will check for first condition only IFF
			
			// for && -> if first condition is false -> return false without checking rest
		
			// for || -> if first condition is true -> returns true without checking rest
		
		
		if(10<1 && 10>2) {
			System.out.println("Inside &&");
		} else {
			System.out.println("Inside && else");
		}
		
		if(10>1 || 10<2) {
			System.out.println("Inside ||");
		} else {
			System.out.println("Inside || else");
		}
	}

}
