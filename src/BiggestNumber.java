
public class BiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[][]=new int[3][3];
	int count=0;
	if(args.length<9) {
		System.out.println("Please enter 9 integer numbers");
	}
	else {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=Integer.parseInt(args[count++]);
			}
		}
		System.out.println("The given array is :");
		int max=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
				if(arr[i][j]>max)
					max=arr[i][j];
			}
			System.out.println("");
		}
		System.out.println("The biggest number in the given array is "+max);
		
	}

	}

}
