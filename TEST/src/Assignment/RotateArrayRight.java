package Assignment;
import java.util.Scanner;

public class RotateArrayRight {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter k (number of rotations): ");
	        int k = sc.nextInt();
	        k = k % n; 

	        reverse(arr, 0, n - 1);     
	        reverse(arr, 0, k - 1);     
	        reverse(arr, k, n - 1);     

	        System.out.println("Array after rotating right by " + k + " positions:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }

	        sc.close();
	    }

	    public static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}