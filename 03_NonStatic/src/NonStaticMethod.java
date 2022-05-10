
public class NonStaticMethod {
	
	public int add() {
		return 10+20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod obj = new NonStaticMethod();
		int result = obj.add();
		System.out.println(result);
		
		System.out.println();
		
		System.out.println(obj.add());
	}

}
