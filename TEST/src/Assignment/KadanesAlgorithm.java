package Assignment;
import java.util.Scanner;
public class KadanesAlgorithm {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int maxSum = kadane(arr, n);
	        System.out.println("Maximum sum of a contiguous subarray: " + maxSum);

	        sc.close();
	    }

	    public static int kadane(int[] arr, int n) {
	        int maxSoFar = arr[0];
	        int currentMax = arr[0];

	        for (int i = 1; i < n; i++) {
	          
	            currentMax = Math.max(arr[i], currentMax + arr[i]);
	            maxSoFar = Math.max(maxSoFar, currentMax);
	        }

	        return maxSoFar;
	    }
	}
