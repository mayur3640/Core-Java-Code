
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// For loop is used when -> we know starting, ending and change in variable already
		
		for(int i=0;i<10; i++) {
			System.out.println(i+1);
		}
		
		
		// for each loop -> used to iterate over arraylist, objects, etc
		
		int arr[] = {10, 20, 30, 40};
		for(int value : arr) {
			System.out.println(value);
		}
	}

}
