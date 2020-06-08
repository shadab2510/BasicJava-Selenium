
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int a[]= {2,4,5,6,7};
		
		
		for(int i=0;i<a.length;i++) {
			
			//System.out.println(a[i]);
		sum=sum+a[i];
		
		//to print the index value of 5 in the array
		if(a[i]==5)
		{
			System.out.println(i);
		}
			
		}
		//to print the sum of the array
		System.out.println(sum);
		
		ArrayListDemo ar = new ArrayListDemo();
		
	}
}
	


