
public class CmdLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = args.length;
		
		if(length == 0) {
			System.out.println("No args provided");
		} else {
			for(int i=0;i<length; i++) {
				System.out.println("args "+i+" - "+args[i]);
			}
		}
	}

}
