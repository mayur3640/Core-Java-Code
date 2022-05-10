
public class If_Else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 5;
		
		if (x > y) {
			System.out.println("X is greater than Y");
		} else {
			System.out.println("X is smaller than or equal to Y");
		}
		
		// Nested if else
		x = 2;
		y = 10;
		if (x > y) {
			System.out.println("X is greater than Y");
		} else if (y > x) {
			System.out.println("Y is greater than X");
		} else {
			System.out.println("X and Y are same");
		}
	}

}
