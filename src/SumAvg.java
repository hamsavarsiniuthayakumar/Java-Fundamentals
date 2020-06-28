
public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6};
int sum=0;
float avg=0.0f;
for(int i=0;i<arr.length;i++) {
	sum+=arr[i];
	
}
avg=(float)sum/arr.length;
System.out.println("Sum: "+sum);
System.out.println("Average: "+avg);
	}

}
