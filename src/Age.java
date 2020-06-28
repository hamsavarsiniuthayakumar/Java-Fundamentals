
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		
		if(gender.equals("Female")  && age>=1 && age<=58 ) {
			System.out.println("8.2%");
		}
		else if( gender.equals("Female") && age>=59 && age<=100 ) {
			System.out.println("9.2%");
		}
		
		else if(gender.equals("Male") && age>=1 && age<=58 ) {
			System.out.println("8.4%");
		}
		else {
			System.out.println("10.5%");
		}
		//https://www.slideshare.net/ShalabhChaudhary1/java-fundamentals-120581970

	}

}
