
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String a=args[0];
		StringBuffer sb=new StringBuffer(a);
		String b=sb.reverse().toString();
		if(a.equals(b)) {
			System.out.println(a+" is a Palindrome");
		}
		else {
			System.out.println(a+" is not a Palindrome");
		}
		*/
		int num=Integer.parseInt(args[0]);
		int temp=num;
		int a=0,b;
		while(temp!=0) {
			b=temp%10;
			a=a*10+b;
			temp=temp/10;
		}
		if(num==a) {
			System.out.println(a+" is a Palindrome");
		}
		else {
			System.out.println(a+" is not a Palindrome");
		}
		}
		
	}


