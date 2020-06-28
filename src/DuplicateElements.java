import java.util.Arrays;

//import org.apache.commons.lang3.ArrayUtils;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={12,34,12,45,67,89};
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			
				if(arr[i]!=arr[i+1]) {
				System.out.print(arr[i]+",");
			}
		
		}
		System.out.print(arr[arr.length-1]);
			


	}

}

