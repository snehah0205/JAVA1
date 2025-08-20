package Assignment;
import java.util.Scanner;
public class MissingNumberInArray {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter n (range 1 to n): ");
	        int n = sc.nextInt();

	        int[] arr = new int[n - 1];
	        System.out.println("Enter " + (n - 1) + " numbers from 1 to " + n + ": ");
	        for (int i = 0; i < n - 1; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int totalSum = n * (n + 1) / 2;

	        int arrSum = 0;
	        for (int num : arr) {
	            arrSum += num;
	        }

	        int missingNumber = totalSum - arrSum;
	        System.out.println("The missing number is: " + missingNumber);

	        sc.close();
	    }
	}