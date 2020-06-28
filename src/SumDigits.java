
public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=Integer.parseInt(args[0]);
int sum=0;
int n;

while(num!=0) {
	 n = num % 10;
     sum = sum + n;
     num = num / 10;
}
System.out.println(sum);
	}

}
