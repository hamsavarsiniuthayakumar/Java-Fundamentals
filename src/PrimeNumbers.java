
public class PrimeNumbers {
	public static int isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  // int a=10;
  // int b=99;
  int a=Integer.parseInt(args[0]);
   int b=Integer.parseInt(args[1]);
   for(int i=a;i<=b;i++) {
	   if(isPrime(i)==1) {
		   System.out.println(i);
	   }
   }
   
	}
	 
}
