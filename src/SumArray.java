
public class SumArray {
	public static int index(int arr[],int n,int a) {
		int b=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==a) {
				b=i;
				break;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		int arr[]= {10,3,6,1,2,7,9};
		int sum=0;
		if(index(arr,arr.length,6)<index(arr,arr.length,7)) {
			for(int i=0;i<arr.length;i++) {
				if(i<index(arr,arr.length,6)||i>index(arr,arr.length,7)) {
					sum+=arr[i];
				}
			}
		}
		else {
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
				
			}
		}
		System.out.print(sum);
	}

}
