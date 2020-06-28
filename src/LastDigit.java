
public class LastDigit {
	public static boolean lastDigit(int a,int b) {
		int c=a%10;
		int d=b%10;
		if(c==d) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lastDigit(27,47));

	}

}
