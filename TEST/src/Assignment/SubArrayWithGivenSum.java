package Assignment;
import java.util.Scanner;
public class SubArrayWithGivenSum {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter the target sum: ");
	        int target = sc.nextInt();

	        findSubarray(arr, n, target);

	        sc.close();
	    }

	    public static void findSubarray(int[] arr, int n, int target) {
	        int start = 0, currSum = 0;
	        boolean found = false;

	        for (int end = 0; end < n; end++) {
	            currSum += arr[end];

	            while (currSum > target && start <= end) {
	                currSum -= arr[start];
	                start++;
	            }

	            if (currSum == target) {
	                System.out.println("Subarray found from index " + start + " to " + end);
	                found = true;
	                break; 
	            }
	        }

	        if (!found) {
	            System.out.println("No subarray with given sum found.");
	        }
	    }
	}