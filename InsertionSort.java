package Demo;

public class InsertionSort {
	public static void display(int a[]) {
		
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
		 System.out.println();
	}
	public static void insertionSort(int a[]) 
	{
		
		for(int i=1; i<a.length; i++) 
		{
			int key = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]>key) 
			{
				a[j+1] = a[j];
				j--;
			}
			 a[j+1] = key;
					
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {22,99,66,33,11,88,55,77,44};
		System.out.println("Original Array: ");
        display(a);
		insertionSort(a);
		System.out.println("After Sorting Array: ");
        display(a);
		
	}

}
