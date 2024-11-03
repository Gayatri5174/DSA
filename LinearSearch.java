package Demo;
import java.util.Scanner;

public class LinearSearch {

  
    public static int linearSearch(int[] arr, int target) {
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
       
        int[] arr = {10, 25, 30, 45, 50, 75, 80};

       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        
        int result = linearSearch(arr, target);

      
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
