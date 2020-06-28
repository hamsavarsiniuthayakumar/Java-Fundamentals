import java.util.*;
public class MiddleElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int b[]=new int[2];
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=s.nextInt();
		}
		double bb=Math.floor((double)n/2);
		b[0]=arr1[(int)bb];
		b[1]=arr2[(int)bb];
		System.out.println("["+b[0]+","+b[1]+"]");

	}

}
