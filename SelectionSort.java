package Demo;

public class SelectionSort {
	public static void display(int a[]) {
		System.out.print("Sorted Array by using Selection Sort: ");
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i] +" ");
		}
	}
	public static void selectionSort(int a[]) 
	{
		int minIndex = 0;
		
		for(int i=0; i<a.length-1; i++) 
		{
			minIndex = i;
			
			for(int j=i+1; j<a.length; j++) 
			{
				if(a[j]<a[minIndex]) 
				{
					minIndex = j;
				}
			}
					int temp = a[minIndex];
					a[minIndex] = a[i];
					a[i] = temp;
					
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {22,99,66,33,11,88,55,77,44};
		selectionSort(a);
		display(a);

	}

}
