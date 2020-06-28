
public class Remove10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,99,10};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10) {
				arr[i]=0;				
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			System.out.print(arr[i]+" ");
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
			System.out.print(arr[i]+" ");
			}
		}

	}

}
