package Assignment;
import java.util.Scanner;
public class MajorityElementOfArray {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int candidate = findCandidate(arr, n);

	        if (isMajority(arr, n, candidate)) {
	            System.out.println("Majority element is: " + candidate);
	        } else {
	            System.out.println("No majority element exists.");
	        }

	        sc.close();
	    }

	    public static int findCandidate(int[] arr, int n) {
	        int count = 0, candidate = -1;
	        for (int num : arr) {
	            if (count == 0) {
	                candidate = num;
	                count = 1;
	            } else if (num == candidate) {
	                count++;
	            } else {
	                count--;
	            }
	        }
	        return candidate;
	    }

	    public static boolean isMajority(int[] arr, int n, int candidate) {
	        int freq = 0;
	        for (int num : arr) {
	            if (num == candidate) freq++;
	        }
	        return freq > n / 2;
	    }
	}