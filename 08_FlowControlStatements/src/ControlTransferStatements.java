
public class ControlTransferStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break - it is used to exit from the loop
		// continue - It skips the current iteration and moves to the next iteration
		
		for (int i=0; i<10; i++) {
			if(i == 5) {
				break;
			} else {
				System.out.println(i);
			}
		}
		System.out.println("For end\n\n");
		
		for (int i=0; i<10; i++) {
			if(i == 5) {
				continue;
			} else {
				System.out.println(i);
			}
		}
		System.out.println("For end\n\n");
		
		// Labelled Block and break
		int x = 10;
		
		block1 : {
			System.out.println("Start of block1");
			
			if(x == 10)
				break block1;
			
			System.out.println("End of block1");
		}
		System.out.println("Outside block1\n\n");
		
		x = 20;
		block2 : {
			System.out.println("Start of block2");
			
			if(x == 10)
				break block2;
			
			System.out.println("End of block2");
		}
		System.out.println("Outside block2");
	}

}
