
public class ReceivedCommandLine {

	public static void main(String[] args) {
		
		 int len = args.length;
		 if(len==0) {
			 System.out.println("No Values");
		 }
		 else {
			 for(int i=0;i<len-1;i++)
			
	          System.out.print(args[i]+",");
	                    
		 }
		 System.out.println(args[args.length-1]);


	}

}
