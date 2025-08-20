package Assignment;
import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElement {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        int[] result = nextGreater(arr, n);

	        System.out.println("Next Greater Elements:");
	        for (int i = 0; i < n; i++) {
	            System.out.println(arr[i] + " -> " + result[i]);
	        }

	        sc.close();
	    }

	    public static int[] nextGreater(int[] arr, int n) {
	        int[] result = new int[n];
	        Stack<Integer> stack = new Stack<>();

	        for (int i = n - 1; i >= 0; i--) {
	          
	            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
	                stack.pop();
	            }

	            result[i] = stack.isEmpty() ? -1 : stack.peek();

	            stack.push(arr[i]);
	        }

	        return result;
	    }
	}