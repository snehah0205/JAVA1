package Assignment;
import java.util.Scanner;
public class FrequencyCountInArray {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        int[] freq = new int[n]; 
	        boolean[] visited = new boolean[n];

	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            if (visited[i]) continue; 

	            int count = 1;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }
	            freq[i] = count;
	        }

	        System.out.println("\nElement | Frequency");
	        for (int i = 0; i < n; i++) {
	            if (!visited[i]) {
	                System.out.println("   " + arr[i] + "    |    " + freq[i]);
	            }
	        }

	        sc.close();
	    }
	}