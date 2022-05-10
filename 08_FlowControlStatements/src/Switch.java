
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Normal Switch
		int a = 2;
		switch(a) {
			case 1: System.out.println("1"); break;
			case 2: System.out.println("2"); break;
			case 3: System.out.println("3"); break;
			default: System.out.println("Not found"); break;
		}
		
		// Common logic switch
		// find character is vowel or not
		String ch = "A";
		switch(ch.toLowerCase()) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u": System.out.println("Vowel"); break;
			default: System.out.println("Not vowel"); break;
		}
		
		
	}

}
