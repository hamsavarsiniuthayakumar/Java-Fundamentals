
public class CheckPrime {

	public static int checkPrime(int num) {
		
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				return 0;
			}
		}
		return 1;
	}
		public static void main(String[] args) {
			int n=Integer.parseInt(args[0]);
			if(checkPrime(n)==1) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}

	}

}
