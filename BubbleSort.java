package Demo;

public class BubbleSort {
	
	public static void display(int a[]) {
		System.out.print("Sorted Array by using Bubble Sort: ");
		for(int i=0;i<a.length;i++)
			
		{
			System.out.print(+a[i]+" ");
		}
		
		}
	public static void bubbleSort(int a[]) {
		for(int i=0; i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
 				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,4,39,99,56,77,84};
		bubbleSort(a);
		display(a);

	}

}
