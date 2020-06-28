
public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,9,2,7,15,11,25,30};
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				
	 System.out.println("Smallest number: "+arr[0]+","+arr[1]);
	 System.out.println("Largest number: "+arr[arr.length-2]+","+arr[arr.length-1]);
        

	}

}
