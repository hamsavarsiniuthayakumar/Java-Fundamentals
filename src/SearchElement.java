
public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,34,56,7};
		int n=56;
		int index=0,c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				index=i;
				c=1;
			}
		}	
		if(c==1) {
			
			System.out.println(index);			
		}
		else {
			System.out.println("-1");
		}

	}

}
