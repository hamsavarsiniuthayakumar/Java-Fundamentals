
public class Floyds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=Integer.parseInt(args[0]);
		System.out.println("Please enter an integer number"+" "+args[0]);
		
			for(int i=1;i<=num;i++) {
				for(int j=1;j<=i;j++) {
					//if(j>i) {
						System.out.print("* ");
						
					//}
				}
				System.out.println("");
			}
			
		

	}

}
