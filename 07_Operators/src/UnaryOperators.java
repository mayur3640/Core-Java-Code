
public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		x = ++x;
		System.out.println("Preincrement of x - "+ x);
		
		x = --x;
		System.out.println("Predecrement of x - "+ x);
		
		x = x++;
		System.out.println("Postincrement of x - "+ x);
		
		x = x--;
		System.out.println("Postdecrement of x - "+ x);
	}

}
